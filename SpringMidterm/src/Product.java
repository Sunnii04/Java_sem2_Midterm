import com.mysql.cj.Messages;
import com.mysql.cj.protocol.Message;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Product {
   private ResultSet rs;
    private Statement stm;
    private Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/TestDocker";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789";

    public void tryconnect(){
        try
        {
             con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(SQLException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public void createTableProduct(){
        tryconnect();
        try{
        Statement statement = con.createStatement();
        String createtable = "CREATE TABLE Product(Id int, name varchar(255), price_per_unit float, active_forsale int)";
        Statement stmt = con.createStatement();
        stmt.execute(createtable);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}