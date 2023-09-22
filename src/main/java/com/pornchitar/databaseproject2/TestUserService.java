/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.databaseproject2;

import com.pornchitar.databaseproject2.model.User;
import com.pornchitar.databaseproject2.service.UserService;

/**
 *
 * @author ASUS
 */
public class TestUserService {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = userService.login("user2", "password1");
        if(user!=null){
            System.out.println("Welcome user : " + user.getName());
        }else{
            System.out.println("Error");
        }
    }
}
