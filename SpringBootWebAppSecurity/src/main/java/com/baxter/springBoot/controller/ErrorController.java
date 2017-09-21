package com.baxter.springBoot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;



@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handleError(HttpServletRequest request,Exception ex) {
    	System.out.println("Hello...1111");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex.getMessage());
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("/error");
        return mav;
    }
}

