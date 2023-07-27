/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author pedro
 */
public class ManegmentDataProductsAndOrders {
    public static void insertContacts(DataProduct Dp) throws SQLException
    {
        try {
            Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "insert into product values(null,'"+Dp.getNameProduct()+"','"+Dp.getDescriptionProduct()+"','"+Dp.getQuantityProduct()+"','"+Dp.getPriceProduct()+"');";
            sql.execute(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Error on isert new product "+error.getMessage());
        }
    }// method insert
    public static ArrayList<DataProduct> listProduct () throws SQLException
    {
        try {
            Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "select * from product";
             ResultSet  Rs = sql.executeQuery(query);
            ArrayList<DataProduct> list = new ArrayList<>();
            while(Rs.next())
            {
                DataProduct Dp = new DataProduct();
                Dp.setId_product(Rs.getInt("id_product"));
                Dp.setNameProduct(Rs.getString("name_product"));
                Dp.setDescriptionProduct(Rs.getString("description_product"));
                Dp.setQuantityProduct(Rs.getInt("quantity_product"));
                Dp.setPriceProduct(Rs.getInt("price_product"));
                list.add(Dp);
            } // end while
            sql.close();
            conn.close();
            return list;
        } catch (SQLException error) {
            throw new SQLException("Error on selec products"+error.getMessage()); 
        }
    }// method listProduct
    public static void deleteProduct(DataProduct Dp) throws SQLException
    {
        try {
            Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "delete from product where id_product ="+Dp.getId_product()+";";
            sql.execute(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Error on delete product product "+error.getMessage());
        }
    }// method deleteProduct
    public static void updateProduct (DataProduct Dp) throws SQLException
    {
        try {
            Connection conn = ConnectionDB.conection();
            Statement sql = conn.createStatement();
            String query = "update product SET name_product='"+Dp.getNameProduct()+"', description_product='"+Dp.getDescriptionProduct()+"', quantity_product='"+Dp.getQuantityProduct()+"','"+Dp.getPriceProduct()+"' where id_product="+Dp.getId_product()+";";
            sql.execute(query);
            sql.close();
            conn.close();
        } catch (SQLException error) {
            throw new SQLException("Error on update product "+error.getMessage());
        }
    }// method updateProduct
    
    public static void insetOrder(DataProduct Dp , DataOrder Do) throws SQLException
    {
        Connection conn = ConnectionDB.conection();
        Statement sql = conn.createStatement();
        String query = "insert into order_product values (null,'"+Dp.getId_product()+"')";
    }// method insertOrderDebit
}// class
