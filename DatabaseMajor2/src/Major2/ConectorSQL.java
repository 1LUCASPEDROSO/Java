package Major2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorSQL {
    private static final String user = "root";
    private static final String password = "rj3po0";
    private static final String URL = "jdbc:mysql://localhost:3306/dbmajor2?useTimezone=true&serverTimezone=UTC";
    // create conection of database 
    
   public static Connection /*Connection is interface null*/ ConectorSQL () throws SQLException {

       try {
         return DriverManager.getConnection (user,password,URL);
       } catch (SQLException error) {
           throw new SQLException ("Error in relize conection of this database.\n case: "+ error.getMessage());
       }
   }// END method Conector SQL
}// class
