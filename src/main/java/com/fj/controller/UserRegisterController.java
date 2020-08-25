package com.fj.controller;

import com.fj.service.UserSVImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fujie on 20/8/24.
 */
@Controller
public class UserRegisterController {
    @Autowired
    private UserSVImpl userSV;

    public void register() throws IOException {
        //前端数据
        String name = "fujjj";
        String pwd = "123";
        //调用service层
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("pwd", pwd);

        userSV.register(map);
    }

    public static void main(String[] args) throws IOException {
        UserRegisterController userRegisterController = new UserRegisterController();
        userRegisterController.register();
    }
}
