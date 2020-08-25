package com.fj.service;

import com.fj.dao.DAO;
import com.fj.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

/**
 * Created by fujie on 20/8/24.
 */
@Service(value = "UserRegisterSV")
public class UserSVImpl implements IUserSV {
    @Autowired
    private UserDAO userDAO;

    public void register(Map<String, String> map) throws IOException {

        System.out.println("注册");
        userDAO.register(map);
    }
}
