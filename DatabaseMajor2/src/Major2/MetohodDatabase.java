package Major2;
import java.sql.Connection; /* interface*/
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
public class MetohodDatabase {
    
public void RegistrerCompany (DataCompany Dc)throws SQLException{
    try {
        // Input data in the database inside this interface
        Connection conexao = ConectorSQL.ConectorSQL();
        Statement Stat = conexao.createStatement();
        String sql = "insert into COMPANY values ('"+Dc.getCompanyName()+"','"+Dc.getLastEvent()+"');";
        Stat.execute(sql);
        Stat.close();
        conexao.close();
    } catch (SQLException error) {
        System.out.println("Error to Registrer data.\n case: "+ error.getMessage());
    }
}//END method RegistrerCompany 
   public static ArrayList<DataCompany> pesquisaDb() throws SQLException {
        try {
            Connection conexao = ConectorSQL.ConectorSQL();
            Statement Stat = conexao.createStatement();
            ResultSet Rs = Stat.executeQuery("select * from COMPANY;");
            ArrayList<DataCompany> ListAux = new ArrayList<>();
            while (Rs.next()) {
                DataCompany Dc = new DataCompany();
                Dc.setCompanyName(Rs.getString("company_name"));
                /*Dc.setCompanyName = setar comapny name,Rs.getString pegar valor da coluna descrita dentro ()*/
                Dc.setLastEvent(Rs.getString("last_event"));
                ListAux.add(Dc);
            }// END while
            Stat.close();
            conexao.close();
            return ListAux;
        } catch (SQLException e) {
           throw new SQLException("error" + e.getMessage());
        }
    }// end method
}// class
