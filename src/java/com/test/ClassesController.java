/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author AlexiaDura
 */
//establish path
@Path("classescontroller")
public class ClassesController {
    //establish request
    @GET
    //establish path whith params
    @Path("/getData/{id}")
    //produce plain text
    @Produces("text/plain")
    //return string and get by path with param
    public String getByPath(@PathParam("id") int id ) throws SQLException, ClassNotFoundException{
        //create array
        ArrayList<Classes> classList = new ArrayList<Classes>();
        //Declare connection
        Connection con;
        String username="KEA";
        String password = "882105";
        //set query with injection
        String query = "select distinct class_name from classes where teacher_id = ?";
        //acces derby client
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        //establish connection
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/KEA",username,password);
        //create prepared statement for sql injection query
        PreparedStatement st = con.prepareStatement(query);
        //set where clause to param received
        st.setInt(1, id);
        //execure query and store in resultset
        ResultSet rst = st.executeQuery();
        //loop set
        while(rst.next()){
            //create object
            Classes classes = new Classes();
            //set values
            classes.setClass_name(rst.getString("class_name"));
            //add to list
            classList.add(classes);
        }
        //create result string
        String result="Class list: \n";
        //loop for results
        for (Classes classObject : classList) {
            //add to string
            result += " " + classObject.getClass_name() + "\n";
        }
            //return string result
        return result;
    }
    
}
