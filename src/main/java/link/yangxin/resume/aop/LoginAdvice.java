package link.yangxin.resume.aop;

import link.yangxin.resume.controller.BaseController;
import link.yangxin.resume.exception.BusinessException;
import link.yangxin.resume.service.AdminLoginService;
import link.yangxin.resume.vo.VRequest;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author yangxin
 * @date 2019/12/12
 */
@Component
@Aspect
public class LoginAdvice extends BaseController {

    @Autowired
    private HttpServletRequest servletRequest;

    @Resource
    private AdminLoginService adminLoginService;

    @Pointcut("execution(link.yangxin.resume.vo.R+ link.yangxin.resume.controller..*.*(link.yangxin.resume.vo.VRequest+,..)) && args(request,..)")
    public void validate(VRequest<?> request) {

    }

    @Around(value = "validate(request)", argNames = "thisJoinPoint,request")
    public Object doValidate(ProceedingJoinPoint thisJoinPoint, VRequest<?> request) throws Throwable {
        String Authorization = servletRequest.getHeader("Authorization");
        String token = StringUtils.substringAfter(Authorization, "Bearer ");
        try {
            adminLoginService.validToken(token);
        } catch (BusinessException e) {
            return fail(e.getMessage());
        }
        return thisJoinPoint.proceed();
    }

}