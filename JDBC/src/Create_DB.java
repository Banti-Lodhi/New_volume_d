import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_DB {
    static final String URL = "jdbc:mysql://localhost:3306/";
    static final String user = "root";
    static final String pass = "banti@936827";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, user, pass);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE DATABASE STD";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
