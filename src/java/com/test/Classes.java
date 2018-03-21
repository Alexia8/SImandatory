/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author AlexiaDura
 */
public class Classes {
    
    private int id_class;
    private String class_name;
    private int teacher_id;
    
    public Classes(){
        
    }

    public Classes(int id_class, String class_name, int teacher_id) {
        this.id_class = id_class;
        this.class_name = class_name;
        this.teacher_id = teacher_id;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }
    
}
