package epic.rentals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Epic - Rentals";
    private static final String USER = "root";
    private static final String PASSWORD = "Adelin2711";
    
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexiune reusita la baza de date!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexiunea la baza de date a fost inchisa.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
