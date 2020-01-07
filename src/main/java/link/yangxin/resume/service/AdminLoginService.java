package link.yangxin.resume.service;

import link.yangxin.resume.config.AdminUser;

/**
 * @author yangxin
 * @date 2020/1/7
 */
public interface AdminLoginService {

    String login(AdminUser adminUser);

    boolean isLogin();

    void validToken(String token);

}
