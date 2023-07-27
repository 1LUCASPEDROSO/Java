/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ManegmentDataProductsAndOrders;
import Model.DataOrder;
import Model.DataProduct;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public class GestManegmentDataProductsAndOrders {
    
    public void insertProduct (DataProduct Dp) throws SQLException
    {
        ManegmentDataProductsAndOrders.insertProduct(Dp);
    }
    public ArrayList<DataProduct> listProducts()throws SQLException
        {
            return ManegmentDataProductsAndOrders.listProduct();
        }// list
    public void  deleteProduct(DataProduct Dp)throws SQLException
        {
             ManegmentDataProductsAndOrders.deleteProduct(Dp);
        }// delete
        public void atualizeContact(DataProduct Dp)throws SQLException
        {
            ManegmentDataProductsAndOrders.updateProduct(Dp);
        }
    public void insertOrder (DataProduct Dp, DataOrder Do) throws SQLException
    {
        ManegmentDataProductsAndOrders.insetOrder(Dp, Do);
    } // insert order    
}// class
