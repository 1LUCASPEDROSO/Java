/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
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
            String query = "insert into contatos values(null,'"+Dc.getNomeContato()+"','"+Dc.getTelefoneContato()+"','"+Dc.getEmailContato()+"');";
            sql.execute(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Error in isert new Contact "+error.getMessage());
        }
    }// method insert
    public static ArrayList<DataContact> listsContacts() throws SQLException
    {
       try { 
           Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "select * from contatos;";
            ResultSet  Rs = sql.executeQuery(query);
            ArrayList<DataContact> lista = new ArrayList<>();
            while(Rs.next())
            {
                DataContact Dc = new DataContact();
                Dc.setIdContato(Rs.getInt("id_contato"));
                Dc.setNomeCOntato(Rs.getString("nome_contato"));
                Dc.setTelefoneContato(Rs.getString("telefone_Contato"));
                Dc.setEmailContato(Rs.getString("email"));
                lista.add(Dc);
            } // end while
            sql.close();
            conn.close();
            return lista;
       } catch (SQLException error) {
            throw new SQLException("Error in list all contacts "+error.getMessage());
        }
    }// method listContacs
    public static void deleteContact(DataContact Dc) throws SQLException
    {
        try {
             Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "delete from contatos where  id_contato ="+Dc.getIdContato();
            sql.execute(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Erro to delete this contact"+error.getMessage());
        }
    }// method deleteContact
     public static void atualizeContact(DataContact Dc) throws SQLException
    {
        try {
             Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "update contatos SET nome_contato='"+Dc.getNomeContato()+"', telefone_Contato='"+Dc.getTelefoneContato()+"', email='"+Dc.getEmailContato()+"' where id_contato="+Dc.getIdContato()+";";
            sql.executeUpdate(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Erro to update this this contact "+error.getMessage());
        }
    }// method deleteContact
}// class
