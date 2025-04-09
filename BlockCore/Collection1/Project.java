import java.util.LinkedList;

public class Project {
  public static void main(String[] args) {
    // ArrayList<String> arr = new ArrayList<>();
    LinkedList<String> arr = new LinkedList<>();
    arr.add("USA");
    arr.add("India");
    arr.add("Germany");
    System.out.println(arr);
    System.out.println(arr.size());
    arr.add(1, "India"); // add element at index number
    System.out.println(arr);
    arr.remove(1);
    System.out.println(arr);

    System.out.println(arr.getFirst());
    System.out.println(arr.getLast());
    arr.removeFirst();
    arr.removeLast();
  }
}