package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.findId(15);

        }


    }




