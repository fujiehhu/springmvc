package com.fj.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by fujie on 20/8/19.
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("/WEB-INF/index.jsp");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}

