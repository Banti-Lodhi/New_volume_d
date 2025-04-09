public class LL {
  Node head;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  // add first | last
  public void addString(String data) {
    Node newData = new Node(data);
    if (head == null) {
      head = newData;
      return;
    }
    newData.next = head;
    head = newData;
  }

  public void addLast(String data) {
    Node newData = new Node(data);
    if (head == null) {
      head = newData;
      return;
    }

    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newData;
  }

  public void printData() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    LL list = new LL();
    list.addString("is");
    list.addString("a");
    printData();
  }
}
