package com.fj.bean;

import org.springframework.stereotype.Component;

import java.lang.ref.SoftReference;

/**
 * Created by fujie on 20/8/24.
 */
@Component
public class User {
    String name;
    String pwd;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
