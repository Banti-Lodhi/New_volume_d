import java.sql.Connection;

public class jdbc {
  public static void main(String[] args) {
    try {
      className("com.mysql.jdbc.Driver");

      String url = "jdbc:mysql//localhost:3306/Students";
      String user = "root";
      String pass = "banti@936827";

      Connectin conn = Driver.getConnection(url, user, pass);
      if (conn.isClosed()) {
        System.err.println("Connection Closed!");
      } else {
        System.out.println("Connection Created");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}