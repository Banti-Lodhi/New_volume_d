public class LList {
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
    if (Node == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if (Node == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  public void printData(String data) {
    if (head == null) {
      System.out.println(("list is empty"));
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.println(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    LList list = new LList();
    list.addFirst("name");
    list.addFirst("My");
    printData();
    list.addLast("is");
    list.addLast("Preetam Singh");
  }
}