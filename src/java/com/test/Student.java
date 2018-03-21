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
public class Student {
    
    private int id_student;
    private String student_name;
    private String student_surname;
    
    public Student(){
        
    }

    public Student(int id_student, String student_name, String student_surname) {
        this.id_student = id_student;
        this.student_name = student_name;
        this.student_surname = student_surname;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_surname() {
        return student_surname;
    }

    public void setStudent_surname(String student_surname) {
        this.student_surname = student_surname;
    }
    
}
