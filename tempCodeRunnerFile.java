import java.sql.*;

public class TestDB {
    public static void main(String[] args) {
        try {
            // Load driver (optional in newer versions)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "username",
                "password"
            );

            System.out.println("Connected!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}