/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author AlexiaDura
 */
@Path("studentcontroller")
public class SudentController {
    
        @GET
    @Path("/getData")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Student> getDataInJSON() throws SQLException, ClassNotFoundException{
        ArrayList<Student> studentList = new ArrayList<Student>();
        Connection con;
        String username="KEA";
        String password = "882105";
        String query = "select * from students";
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/KEA",username,password);
        Statement st = con.createStatement();
        ResultSet rst = st.executeQuery(query);
        while(rst.next()){
            Student student = new Student();
            student.setId_student(rst.getInt("id_student"));
            student.setStudent_name(rst.getString("student_name"));
            student.setStudent_surname(rst.getString("student_surname"));
            studentList.add(student);
        }
        return studentList;
    }
    
}
