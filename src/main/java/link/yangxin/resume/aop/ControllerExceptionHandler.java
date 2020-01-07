package link.yangxin.resume.aop;

import link.yangxin.resume.controller.BaseController;
import link.yangxin.resume.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Component
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler extends BaseController {

    @ExceptionHandler
    public R<Void> handle(Exception e) {
        log.error(e.getMessage(), e);
        return fail(e.getMessage());
    }

}