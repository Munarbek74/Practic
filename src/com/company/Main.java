package com.company;

import com.company.dao.UserDao;
import com.company.model.User;

public class Main {
    public static void main(String[] args) {
        User[] user = new User[3];
        user[0] = new User(1, "Асанов У", 21, Gender.MALE);
        user[1] = new User(2, "Усонова А", 25, Gender.FEMALE);
        user[2] = new User(3, "Тешебаев Б.", 19, Gender.MALE);
        UserDao userDao = new UserDao(user);
        System.out.println(userDao);


    }



}
