import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDisplay {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // replace with your database URL
        String user = "SunSql"; // replace with your database username
        String password = "1234"; // replace with your database password

        try {

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            String query = "SELECT id, name, price_per_unit, active_for_sell FROM Product";
            ResultSet rs = stmt.executeQuery(query);

            System.out.printf("%-5s %-10s %-15s %-15s%n", "id", "name", "price_per_unit", "active_for_sell");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price_per_unit = rs.getDouble("price_per_unit");
                boolean active_for_sell = rs.getBoolean("active_for_sell");

                System.out.printf("%-5d %-10s %-15.2f %-15b%n", id, name, price_per_unit, active_for_sell);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}