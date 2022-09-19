package com.wxl.controller.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作为springMVC的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class PEA {
    @ExceptionHandler//拦截所有的异常信息
    public R doException(Exception ex){
        //日志
        ex.printStackTrace();
        return new R("服务器出现异常，请稍后重试或联系客服处理");
    }
}
