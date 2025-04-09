import java.util.Scanner;

public class array {
  public static void main(String[] args) {
    // Simple array String
    // String names[] = new String[3];
    // names[0] = "Sony Pal";
    // names[1] = "Tennis";
    // names[2] = "Pair";
    // for (int i = 0; i < names.length; i++) {
    // System.out.println(names[i]);
    // }

    // Scanner scan = new Scanner(System.in);
    // for (int i = 0; i < 3; i++) {
    // System.out.println("Enter the pin number...");
    // int pinNum = scan.nextInt();
    // if (pinNum == 1234) {
    // System.out.println("welcome");
    // break;
    // } else {
    // System.out.println("wrong pin");
    // if (i == 2) {
    // System.out.println("Card would be blocked.");
    // }
    // }
    // }

    // Equals method and while loop
    // Scanner scan = new Scanner(System.in);
    // String cdn = "yes";
    // while (cdn.equals("yes")) {
    // System.out.println("Enter the Amount");
    // int Amount = scan.nextInt();
    // System.out.println("Please collect the money");
    // System.out.println("Do u want to continue(yes/no)");
    // cdn = scan.next();
    // }

    // Do While Loop
    // int x = 300;
    // do {
    // System.out.println(x);
    // x--;
    // } while (x >= 1);

    // Practice Code
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Username");
    String user = scan.next();
    System.out.println("Enter the password");
    String pass = scan.next();
    if (user.equals("mike")) {
      if (pass.equals("abcd")) {
        System.out.println("Welcome");
      } else {
        System.out.println("Password is invalid");
      }
    } else {
      System.out.println("User not does exists");
    }
  }
}