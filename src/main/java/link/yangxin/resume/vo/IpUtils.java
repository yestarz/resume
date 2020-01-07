package link.yangxin.resume.vo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangxin
 * @date 2019/11/4
 */
@Slf4j
public class IpUtils {

    /**
     * 获取ip地址
     *
     * @param bRequest
     * @return
     */
    public static String getIpAddr(HttpServletRequest bRequest) {
        String ipString = bRequest.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = bRequest.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = bRequest.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            try {
                ipString = bRequest.getRemoteAddr();
            }catch (Exception e){
                log.error(e.getMessage(), e);
            }
        }
        final String[] arr = ipString.split(",");
        for (final String str : arr) {
            if (!"unknown".equalsIgnoreCase(str)) {
                ipString = str;
                break;
            }
        }
        return ipString;
    }

}
