import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class update {
  private final static String url = "jdbc:mysql://localhost:3306/std";
  private final static String user = "root";
  private final static String pass = "banti@936827";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.JDBC.Driver");
      System.out.println("Class Found Successfully...");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      // Statement stmt = conn.createStatement();
      System.out.println("Successful Connection...");
      // String query = String.format("UPDATE employees SET name = '%s' WHERE id =
      // %o", "Shubham", 3);
      String query = "SELECT salary FROM employees WHERE id = ?";
      PreparedStatement preState = conn.prepareStatement(query);
      preState.setInt(1, 1);
      ResultSet resultSet = preState.executeQuery();

      if (resultSet.next()) {
        double salary = ((ResultSet) preState).getDouble("salary");
        System.out.println("marks:" + salary);
      } else {
        System.out.println("salary not found!..");
      }
      // int rowAffected = stmt.executeUpdate(query);

      // if (rowAffected > 0) {
      // System.out.println("Updated Successfully...");
      // } else {
      // System.out.println("Error Not Updated...");
      // }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}