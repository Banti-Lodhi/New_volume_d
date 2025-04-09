package HospitalManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
  private Connection connection;
  private Scanner scanner;

  public Patient(Connection connection, Scanner scanner) {
    this.connection = connection;
    this.scanner = scanner;
  }

  public void addPatient() {
    System.out.println("Enter patient name...");
    String name = scanner.next();
    System.out.println("Enter patient age...");
    int age = scanner.nextInt();
    System.out.println("Enter patient gender...");
    String gender = scanner.next();

    try {
      String query = "INSERT INTO patients(name, age, gender) VALUES(?, ?, ?)";
      PreparedStatement preparestate = connection.prepareStatement(query);
      preparestate.setString(1, name);
      preparestate.setInt(2, age);
      preparestate.setString(3, gender);

      int rowAffected = preparestate.executeUpdate();
      if (rowAffected > 0) {
        System.out.println("Patient added Successfully...");
      } else {
        System.out.println("Error Occured! Not Added Patient in the hospital list...");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void viewPatient() {
    String query = "SELECT * FROM patients";
    try {
      PreparedStatement prepare = connection.prepareStatement(query);
      ResultSet resultset = prepare.executeQuery();
      System.out.println("Patients...");
      System.out.println("+----------+------------------+--------------+----------------+");
      System.out.println("Patient_id | name             |age           | gender          ");
      System.out.println("+----------+------------------+--------------+----------------+");
      while (resultset.next()) {
        int id = resultset.getInt("id");
        String name = resultset.getString("name");
        int age = resultset.getInt("age");
        String gender = resultset.getString("gender");
        System.out.printf("|%-12s|%-20s|%-10s|%-12s");
        System.out.println("+----------+------------------+--------------+----------------+");
      }
    } catch (SQLException e) {
      e.getStackTrace();
    }
  }

  public boolean getPatientById(int id) {
    String query = "SELECT * FROM patients WHERE id = ?";
    try {
      PreparedStatement prepare = connection.prepareStatement(query);
      prepare.setInt(1, id);
      ResultSet resultSet = prepare.executeQuery();
      if (resultSet.next()) {
        return true;
      } else {
        return false;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}