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
public class Teacher {
    
    private int id_teacher;
    private String teacher_name;
    private String teacher_surname;
    
    public Teacher(){
    };
   
    public Teacher(int id_teacher, String teacher_name, String teacher_surname) {
        this.id_teacher = id_teacher;
        this.teacher_name = teacher_name;
        this.teacher_surname = teacher_surname;
    }

    public int getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_surname() {
        return teacher_surname;
    }

    public void setTeacher_surname(String teacher_surname) {
        this.teacher_surname = teacher_surname;
    }
    
}
