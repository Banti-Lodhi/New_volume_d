import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
  private static final String url = "jdbc:mysql://localhost:3306/std";
  private static final String user = "root";
  private static final String pass = "banti@936827";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connected Done!");
      Statement stmt = conn.createStatement();

      String query = String.format("DELETE FROM employees WHERE id = %o", 3);

      int rowAffected = stmt.executeUpdate(query);

      if (rowAffected > 0) {
        System.out.println("Deleted done!");
      } else {
        System.out.println("Errot Occured!");
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}