package com.fj.service;

import java.io.IOException;
import java.util.Map;

/**
 * Created by fujie on 20/8/24.
 */
public interface IUserSV {
    void register(Map<String, String> map) throws IOException;
}
