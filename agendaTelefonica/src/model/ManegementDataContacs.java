/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author 182120037
 */
public class ManegementDataContacs {
    public static void insertContacts(DataContact Dc) throws SQLException
    {
        try {
            Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "insert into contatos values(null,'"+Dc.getNomeCOntato()+"','"+Dc.getTelefoneContato()+"','"+Dc.getEmailContato()+"');";
            sql.execute(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Error in isert new Contact "+error.getMessage());
        }
    }// method 
}// class
