package com.basic.exHandler;

import com.somunsm.core.exception.UpdateException;
import com.somunsm.core.result.ResponseResult;
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
    public ResponseResult<?> defaultHandler(HttpServletRequest req, Exception ex) {
        log.error("default exception Handler:", ex);
        return ResponseResult.fail();
    }

    @ExceptionHandler(UpdateException.class)
    @ResponseBody
    public ResponseResult<?> updateExHandler(HttpServletRequest req, UpdateException ex) {
        log.error(ex.getMessage());
        return ResponseResult.failMsg(ex.getMessage());
    }

}
