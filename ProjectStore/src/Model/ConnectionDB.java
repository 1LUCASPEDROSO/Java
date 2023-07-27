/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class ConnectionDB {
    private static final String URL= "jdbc:mysql://localhost:3306/db_store?useTimeZone=true&serverTimeZone=UTC";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    public static Connection conection() throws SQLException
    {
        try{
        return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException error)
        {
            throw new SQLException("Error in try connection. ERROR "+error.getMessage());
        }
    }// method  jdbc:mysql://localhost:3306/db_agenda
}// class
