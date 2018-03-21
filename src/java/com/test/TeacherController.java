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
@Path("teachercontroller")
public class TeacherController {
    //establish a request
    @GET
    //establis path
    @Path("/getData")
    //produce json outpur
    @Produces(MediaType.APPLICATION_JSON)
    //specify output type
    public ArrayList<Teacher> getDataInJSON() throws SQLException, ClassNotFoundException{
        //instance arraylist for return
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        //instance connection to DB
        Connection con;
        //set parameters for DB
        String username="KEA";
        String password = "882105";
        //set query needed
        String query = "select * from teachers";
        //choose client
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        //esablish connection
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/KEA",username,password);
        //set statement for quering db
        Statement st = con.createStatement();
        //execute query and store in resultSet
        ResultSet rst = st.executeQuery(query);
        //loop set
        while(rst.next()){
            //create object
            Teacher teacher = new Teacher();
            //set values
            teacher.setId_teacher(rst.getInt("id_teacher"));
            teacher.setTeacher_name(rst.getString("teacher_name"));
            teacher.setTeacher_surname(rst.getString("teacher_surname"));
            //add to output list
            teacherList.add(teacher);
        }
        //return list
        return teacherList;
    }
    
}
