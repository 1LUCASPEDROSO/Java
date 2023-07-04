/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.DataContact;
import model.ManegementDataContacs;
import java.sql.SQLException;
/**
 *
 * @author 182120037
 */
public class GestDataContacts {
        public void insertContact(DataContact dc ) throws SQLException
        {
            ManegementDataContacs.insertContacts(dc);
        }// insert
}// class 
