package SystemJava;

import java.util.ArrayList;

public class textBlock {
  public static void main(String[] args) {
    // String x = """
    // hi,
    // Preetaam Singh has data scientist in india
    // for solving problem technical issue and launch a auto machine
    // """;
    // System.out.println(x);

    // Integer x1 = new Integer(10);
    // int x2 = x1;
    // System.out.println(x2);
    // Integer x3 = 20;
    // Character c = 'y';
    // Float f1 = 10.8f;
    // Double d = 18.95;
    // Boolean b = true;
    // System.out.println("[" + x1 + x3 + c + f1 + d + b + "]");
    // Integer x5 = Integer.valueOf(10);
    // Integer x6 = Integer.valueOf(x1);
    // Integer x7 = Integer.valueOf(x3);

    // System.out.println(x5);
    // System.out.println(x6);
    // System.out.println(x7);

    // Data type method
    ArrayList<String> arr = new ArrayList<>();
    arr.add("USA");
    arr.add("India");
    arr.add("Germany");
    System.out.println(arr);
    System.out.println(arr.size());
    arr.add(1, "India"); // add element at index number
    System.out.println(arr);
    arr.remove(1);
    System.out.println(arr);
  }
}