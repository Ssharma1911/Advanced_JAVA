import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String pass = "sharma29@";

        try {
            // Load Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connection
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to the database successfully!");

            // Create Statement
            Statement stmt = con.createStatement();

            // 1. Create Table
            String createTable = "CREATE TABLE EMP (" +
                    "ID NUMBER (3), " +
                    "NAME VARCHAR2(50), " +
                    "SALARY NUMBER)";

            try {
                stmt.executeUpdate(createTable);
                System.out.println("Table created successfully!");
            } catch (Exception e) {
                System.out.println("Table may already exist.");
            }

            // 2. Insert Data
          /*   PreparedStatement pstmt = con.prepareStatement("INSERT INTO EMP (ID, NAME, SALARY) VALUES (?, ?, ?)");
            pstmt.setInt(1, 101);
            pstmt.setString(2, "John Doe");
            pstmt.setInt(3, 50000);
            pstmt.executeUpdate();
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Jane Smith");
            pstmt.setInt(3, 60000);
            pstmt.executeUpdate();
            pstmt.setInt(1, 103);
            pstmt.setString(2, "Bob Johnson");
            pstmt.setInt(3, 55000);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully!"); */

/*             PreparedStatement pstmt = con.prepareStatement("update EMP set SALARY = ? where ID = ?");
            pstmt.setInt(1, 55000);
            pstmt.setInt(2, 101); */
            PreparedStatement pstmt = con.prepareStatement("delete from EMP where ID = ?");
            pstmt.setInt(1, 103);
            int n=pstmt.executeUpdate();
            System.out.println(n+" row(s) deleted successfully!");
            // 3. Display Data
            String selectQuery = "SELECT * FROM EMP";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println(
                        rs.getInt("ID") + " " +
                        rs.getString("NAME") + " " +
                        rs.getInt("SALARY")
                );
            }
            // Close
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}