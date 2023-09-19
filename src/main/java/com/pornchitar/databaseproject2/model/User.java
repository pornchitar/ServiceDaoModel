/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.databaseproject2.model;

/**
 *
 * @author ASUS
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int role;
    private String gender;
    
    public User(int id, String name, String password, int role, String gender) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.gender = gender;
    }

    public User(String name, String password, int role, String gender) {
        this.id = -1;
        this.name = name;
        this.password = password;
        this.role = role;
        this.gender = gender;
    }

    public User() {
        this.id = -1;
    }
    
    
}
