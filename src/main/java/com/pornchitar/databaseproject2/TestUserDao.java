/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.databaseproject2;

import com.pornchitar.databaseproject2.dao.UserDao;
import com.pornchitar.databaseproject2.helper.DatabaseHelper;
import com.pornchitar.databaseproject2.model.User;

/**
 *
 * @author ASUS
 */
public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        for(User u: userDao.getAll()){
            System.out.println(u);
        }
        User user1 = userDao.get(2);
        System.out.println(user1);
        
//        User newUser = new User("user3", "password", 2, "F");
//        User insertedUser = userDao.save(newUser);
//        System.out.println(insertedUser);
//        insertedUser.setGender("M");
        user1.setGender("F");
        userDao.update(user1);
        User updateUser = userDao.get(user1.getId());
        System.out.println(updateUser);
        
        userDao.delete(user1);
        for(User u: userDao.getAll()){
            System.out.println(u);
        }
        DatabaseHelper.close();
    }
    
}
