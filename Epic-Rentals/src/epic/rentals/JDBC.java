package epic.rentals;

import java.sql.*;

public class JDBC {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Epic - Rentals";
    private static final String USER = "root";
    private static final String PASSWORD = "Adelin2711";
    
    private static String userEmail;
    
    //Functie pentru a obtine emailul utilizatorului logat
    public  static String getEmail(){
        return userEmail;
    }
    
    private static Connection connection = null;

    // Functie pentru conectarea la baza de date
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
    
    // Functie pentru verificarea corectitudinii datelor de logare
    public static char emailCheck(String email, String password){
        try{
            String query = "SELECT roleid FROM users WHERE email = ? AND password = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            userEmail = email;
            if(rs.next())
                if(rs.getInt("roleID")==2)
                    return 'u';
                else 
                    return 'a';
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 'i';
    }
    
    // Functie pentru salvarea datelor unui utilizator nou in baza de date la inregistrare
    public static void registerUser(String firstName, String lastName, String email, String phone, String address, String password){
        
        String query = "insert into users (firstname, lastname, email, phonenumber, address, roleid, password)\n" +
        "values \n" +
        "('" +  firstName + "', '" + lastName + "', '" + email + "', '" + phone + "', '" + address + "', 2, '" + password + "');";
        
        
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        }
        catch(SQLException e){
            e.printStackTrace();
        } 
    }
    
    // Functie pentru salvarea datelor unui utilizator nou in baza de date de catre un admin
    public static void addUser(String firstName, String lastName, String email, String phone, String address, char role, String password){
        
        char roleNumber;
        
        if(role ==  'a')
            roleNumber = '1';
        else
            roleNumber = '2';
        
        String query = "insert into users (firstname, lastname, email, phonenumber, address, roleid, password)\n" +
        "values \n" +
        "('" +  firstName + "', '" + lastName + "', '" + email + "', '" + phone + "', '" + address + "', " + roleNumber + ", '"  + password + "');";
        
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        }
        catch(SQLException e){
            e.printStackTrace();
        } 
    }
    
    // Functie pentru salvarea datelor unui item nou in baza de date de catre un admin
    public static void addItem(String title, int category, String type, int year, String  rating){
        String query = "insert into items (title, categoryid, type, releaseyear, agerating)\n" +
        "values \n" +
        "('" +  title + "', " + category + ", '" + type + "', " + year + ", '" + rating + "');";
        
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        }
        catch(SQLException e){
            e.printStackTrace();
        } 
    }
    
    // Functie pentru a opri conexiunea la baza de date
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
