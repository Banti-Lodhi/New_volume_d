import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsert {
  private static final String url = "jdbc:mysql://localhost:3306/std";
  private static final String pass = "banti@936827";
  private static final String user = "root";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Class found Done!");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connection Done!");
      String query = "INSERT INTO employees(id, name, job_title, salary) VALUES(?, ?, ?, ?)";
      // Statement stmt = conn.createStatement();
      PreparedStatement preStmt = conn.prepareStatement(query);

      preStmt.setInt(1, 4);
      preStmt.setString(2, "Google CO");
      preStmt.setString(3, "Data Analyticals");
      preStmt.setDouble(4, 78000.89);

      int rowAffected = preStmt.executeUpdate();
      if (rowAffected > 0) {
        System.out.println("Done Data Inserted...");
      } else {
        System.out.println("Rejected Note Done...");
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
