package com.basic.exHandler;

import com.somunsm.core.exception.UpdateException;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    public String defaultHandler(HttpServletRequest req, RuntimeException ex) {
        log.error("default exception Handler:", ex);
        return ex.getMessage();
    }

    @ExceptionHandler(UpdateException.class)
    @ResponseBody
    public String updateExHandler(HttpServletRequest req, RuntimeException ex) {
        log.error(ex.getMessage());
        return ex.getMessage();
    }

}
