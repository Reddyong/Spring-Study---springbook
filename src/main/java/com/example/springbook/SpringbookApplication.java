package com.example.springbook;

import com.example.springbook.dao.NUserDao;
import com.example.springbook.dao.UserDao;
import com.example.springbook.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

//@SpringBootApplication
public class SpringbookApplication {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        SpringApplication.run(SpringbookApplication.class, args);

        UserDao dao = new NUserDao();

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");

    }

}
