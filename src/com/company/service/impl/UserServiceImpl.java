package com.company.service.impl;

import com.company.Gender;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.ArrayList;

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

            User user1= new User(1, "Асанов У", 21, Gender.MALE);
        User user2 = new User(2, "Усонова А", 25, Gender.FEMALE);
        User user3 = new User(3, "Тешебаев Б.", 19, Gender.MALE);
        UserDao userDao = new UserDao(user1);
        UserDao userDao1 = new UserDao(user2);
        UserDao userDao2 = new UserDao(user3);
        ArrayList<UserDao> strings = new ArrayList<>();
        strings.add(0,userDao);
        strings.add(1,userDao1);
        strings.add(2,userDao2);

        for (int i = 0; i < strings.size(); i++) {

                if (strings.get(i).getUsers().getId()==a) {

                    System.out.println(strings.get(i));

            }
            }

    }





    @Override
    public void delId(int b) {
        User user1= new User(1, "Асанов У", 21, Gender.MALE);
        User user2 = new User(2, "Усонова А", 25, Gender.FEMALE);
        User user3 = new User(3, "Тешебаев Б.", 19, Gender.MALE);
        UserDao userDao = new UserDao(user1);
        UserDao userDao1 = new UserDao(user2);
        UserDao userDao2 = new UserDao(user3);
        ArrayList<UserDao> strings = new ArrayList<>();
        strings.add(0,userDao);
        strings.add(1,userDao1);
        strings.add(2,userDao2);
        for (int i = 0; i < strings.size(); i++) {

            if (strings.get(i).getUsers().getId()==b) {
            strings.remove(i);
                System.out.println(strings);

            }
        }
    }

    @Override
    public void allUsers() {
        System.out.println();
    }
}
