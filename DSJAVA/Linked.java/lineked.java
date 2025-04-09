public class linked {
  Node head;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    if (head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode = newNode;
  }

  public void printed() {
    if (head == null) {
      System.out.println("list is empty.");
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    linked list = new linked();
    list.addFirst("name");
    list.addFirst("My");
    printed();
    list.addLast("is");
    list.addLast("Preetam Singh");
    printed();
  }
}