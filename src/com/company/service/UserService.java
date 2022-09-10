package com.company.service;

import com.company.dao.UserDao;
import com.company.model.User;

import java.util.ArrayList;
import java.util.Arrays;

public interface UserService {

    void userAdd();
    void findId(int a);
    void delId(int a);
    void allUsers();

}
