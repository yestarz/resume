package link.yangxin.resume.service.impl;

import link.yangxin.resume.cache.CacheService;
import link.yangxin.resume.config.AdminUser;
import link.yangxin.resume.exception.BusinessException;
import link.yangxin.resume.service.AdminLoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Resource
    private AdminUser adminUser;

    @Resource
    private CacheService cacheService;

    private String loginKey = "admin:user:login:token";

    @Override
    public String login(AdminUser adminUser) {
        if (!this.adminUser.equals(adminUser)) {
            throw new BusinessException("账户/密码不正确");
        }
        if (cacheService.contains(loginKey)) {
            return cacheService.get(loginKey);
        }

        String token = DigestUtils.md5DigestAsHex((adminUser.getUsername() + System.currentTimeMillis()).getBytes());
        cacheService.put(loginKey, token);
        return token;
    }

    @Override
    public boolean isLogin() {
        return cacheService.contains(loginKey);
    }

    @Override
    public void validToken(String token) {
        if (StringUtils.isBlank(token)) {
            throw new BusinessException("认证参数不能为空");
        }
        if (!this.isLogin()) {
            throw new BusinessException("请先登录");
        }
        String o = this.cacheService.get(loginKey);
        if (!StringUtils.equals(o, token)) {
            throw new BusinessException("token无效");
        }
    }
}