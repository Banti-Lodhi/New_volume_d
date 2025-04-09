import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
  private static final String URL = "jdbc:mysql://localhost:3306/std";
  private static final String user = "root";
  private static final String pass = "banti@936827";

  public static void main(String[] args) throws ClassNotFoundException {

    try {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Class loaded Successfully...");
    } catch (ClassNotFoundException e) {
      e.getMessage();
    }

    try {
      Connection conn = DriverManager.getConnection(URL, user, pass);
      Statement stmt = conn.createStatement();
      System.out.println("Connection Succussfully....");

      String query = String.format("INSERT INTO employees(id, name, job_title, salary) VALUES(%o, '%s', '%s', %f)", 3,
          "Sonu Singh", "Software Engineer", 25000.90);
      int rowAffected = stmt.executeUpdate(query);
      if (rowAffected > 0) {
        System.out.println("Data inserted Successfully...");
      } else {
        System.out.println("Data not Inserted...");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
