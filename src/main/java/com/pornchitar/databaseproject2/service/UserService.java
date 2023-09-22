/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.databaseproject2.service;

import com.pornchitar.databaseproject2.dao.UserDao;
import com.pornchitar.databaseproject2.model.User;

/**
 *
 * @author ASUS
 */
public class UserService {
    public User login(String name, String password){
        UserDao userDao = new UserDao();
        User user = userDao.getByName(name);
        if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
