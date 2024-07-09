import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practica - epicrentals";
        String username = "root";
        String password = "Adelin2711";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Items.Title AS ItemTitle, Categories.CategoryName \n" +
                    "FROM Items\n" +
                    "JOIN Categories ON Items.CategoryID = Categories.CategoryID;");
            while(resultSet.next()){
                System.out.println(resultSet.getString("ItemTitle") + " " + resultSet.getString("CategoryName"));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
