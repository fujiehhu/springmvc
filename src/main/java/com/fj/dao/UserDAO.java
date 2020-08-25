package com.fj.dao;

import com.fj.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 20/8/24.
 */
@Repository
public class UserDAO extends DAO {
    @Autowired
    private User user;

//    public static void main(String[] args) throws IOException {
//        UserDAO userDAO = new UserDAO();
//        userDAO.test();
//    }

    public void test() throws IOException {
        SqlSession session = getBaseDao();
        List<User> user = session.selectList("User.select", null);
        for (int i = 0; i < user.size(); i++) {
            User user1 = user.get(i);
            System.out.println(user1);
        }
        session.close();
    }

    public void register(Map<String, String> map) throws IOException {
        System.out.print("[register]--");
        System.out.println(map);
    }
}
