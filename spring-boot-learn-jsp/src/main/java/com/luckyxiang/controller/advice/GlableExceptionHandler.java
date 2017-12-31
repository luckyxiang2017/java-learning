package com.luckyxiang.controller.advice;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class GlableExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, String> handle() {
        return new HashMap<String, String>() {
            {
                put("status", "error");
                put("message", "系统错误，请稍后再试！");
            }
        };
    }
}
