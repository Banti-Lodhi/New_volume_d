import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exception {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/std";
    String user = "root";
    String pass = "banti@936827";
    String query = "select * from employees";
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Drivers loaded Successfully...");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      System.out.println("Connection Established Successfully...");
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job_title = rs.getString("job_title");
        double salary = rs.getDouble("salary");
        System.out.println("\n--------------------------------------------------------------------------------\n");
        System.out.println("id: " + id + "  ");
        System.out.println("name: " + name + "  ");
        System.out.println("job_title: " + job_title + "  ");
        System.out.println("Salary: " + salary);
      }
      rs.close();
      stmt.close();
      conn.close();
      System.out.println();
      System.out.println("Connection Successfully Closed...");
    } catch (

    Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
