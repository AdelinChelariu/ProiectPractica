import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/teste";
        String username = "root";
        String password = "Adelin2711";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("email"));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
