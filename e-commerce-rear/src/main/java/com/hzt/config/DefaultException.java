package com.hzt.config;

import com.hzt.util.ResultJson;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DefaultException {
    @ExceptionHandler
    public ResultJson defaultExceptionHandler(Exception ex) {
        ex.printStackTrace();
        return ResultJson.error(ex.getMessage());
    }
    
}
