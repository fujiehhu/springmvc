package com.fj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by fujie on 20/8/19.
 */
@Controller
public class HelloController {
    private String rtnMsg;

    @RequestMapping(value = "/index")
    public ModelAndView handleRequest(HttpSession session) throws Exception {
        String tname = (String) session.getAttribute("name");
        String tpwd = (String) session.getAttribute("pwd");
        System.out.println(tname + tpwd);
        if (tname == null) {
            ModelAndView mav = new ModelAndView("index");
            mav.addObject("message", "首页");
            mav.addObject("rtnMsg", "未登录");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView("index");
            mav.addObject("message", "首页");
            mav.addObject("rtnMsg", "登录成功");
            return mav;
        }

    }

    @RequestMapping("/login")
    public ModelAndView handleLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("message", "登录页面");
        return mav;
    }

    @RequestMapping("/loginAction")
    public ModelAndView handleloginAction(HttpSession session, String name, String pwd) throws Exception {
        //调用DAO
        if (name.equals("fj") && pwd.equals("1")) {
            session.setAttribute("name", name);
            session.setAttribute("pwd", pwd);
            ModelAndView mav = new ModelAndView("redirect:/index");
            this.rtnMsg = "登录成功";
            return mav;
        } else {
            session.setAttribute("name", "中文");
            session.setAttribute("pwd", "中文");
            ModelAndView mav = new ModelAndView("login");
            mav.addObject("rtnMsg", "登录失败");
            return mav;
        }
    }

}
