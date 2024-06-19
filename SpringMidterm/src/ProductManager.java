//import java.sql.*;
//
//public class ProductManager {
//
//
//    public static void main(String[] args) {
//
//
//            System.out.println("ID\tName\tPrice per Unit\tActive for Sell");
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                double pricePerUnit = resultSet.getDouble("price_per_unit");
//                boolean activeForSell = resultSet.getBoolean("active_for_sell");
//                System.out.printf("%d\t%s\t%.2f\t%b%n", id, name, pricePerUnit, activeForSell);
//            }
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM Product");
//            // Close the resources
//
//
//        }
//    }
//}