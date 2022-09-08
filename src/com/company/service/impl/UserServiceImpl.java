package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao[] userDaos;

    public UserDao[] getUserDaos() {
        return userDaos;
    }

    public void setUserDaos(UserDao[] userDaos) {
        this.userDaos = userDaos;
    }



    public UserServiceImpl(UserDao[] userDaos) {
        this.userDaos = userDaos;
    }

    public UserServiceImpl() {

    }

    @Override
    public void userAdd() {
        System.out.println("Жаны колдонуучууну кошуу");
    }

    @Override
    public void findId(int a) {
        UserDao userDao = new UserDao();
        for (int i = 0; i < userDao.getUsers().length; i++) {
            if (userDao.equals(1)) {
                System.out.println(userDao);
            }

        }
    }

    @Override
    public void delId(int b) {

        System.out.println("Id боюнча жок кылуу");
    }

    @Override
    public void allUsers() {
        System.out.println("Бардык колдонуучуларды алуу");
    }
}
