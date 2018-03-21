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
public class RelStudentClass {
    
    private int classes_id;
    private int students_id;

    public RelStudentClass(int classes_id, int students_id) {
        this.classes_id = classes_id;
        this.students_id = students_id;
    }

    public int getClasses_id() {
        return classes_id;
    }

    public void setClasses_id(int classes_id) {
        this.classes_id = classes_id;
    }

    public int getStudents_id() {
        return students_id;
    }

    public void setStudents_id(int students_id) {
        this.students_id = students_id;
    }
       
}
