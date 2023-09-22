/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pornchitar.databaseproject2.dao;

import com.pornchitar.databaseproject2.model.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface Dao<T> {
    T get(int id);
    List<T> getAll();
    T save(T obj);
    T update(T obj);
    int delete(T obj);
    List<T> getAll(String where, String order);
}
