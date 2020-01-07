package link.yangxin.resume.controller;

import link.yangxin.resume.vo.R;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangxin
 * @date 2019/12/12
 */
public class BaseController {

    @Autowired
    protected HttpServletRequest servletRequest;

    protected <T> R<T> success(T t) {
        return R.success(t);
    }

    protected <T> R<T> success() {
        return R.success();
    }

    protected <T> R<T> fail(String message) {
        return R.fail(message);
    }

    protected <T> R<T> fail(int code, String message) {
        return R.fail(code, message);
    }

    protected void setAttr(String key, Object value) {
        servletRequest.setAttribute(key, value);
    }

}