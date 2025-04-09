public class dbms {
  public static void main(String[] args) {
    try 

      Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/Students", "root", "banti@936827");
      System.out.println(conn);

      if (conn.isClosed()) {
        System.err.println("Connection Closed! Try Again");
      } else {
        System.out.println("Connection Created Successfully");
      }

    }catch(

  Exception e)
  {
    e.printStackTrace();
  }
}}
