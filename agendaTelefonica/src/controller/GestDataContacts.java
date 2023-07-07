/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.DataContact;
import model.ManegementDataContacs;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author 182120037
 */
public class GestDataContacts {
        public void insertContact(DataContact dc ) throws SQLException
        {
            ManegementDataContacs.insertContacts(dc);
        }// insert
        public ArrayList<DataContact> listContacts()throws SQLException
        {
            return ManegementDataContacs.listsContacts();
        }// list
        public void  deleteContact(DataContact dc)throws SQLException
        {
             ManegementDataContacs.deleteContact(dc);
        }// delete
        public void atualizeContact(DataContact dc)throws SQLException
        {
            ManegementDataContacs.atualizeContact(dc);
        }
}// class 
