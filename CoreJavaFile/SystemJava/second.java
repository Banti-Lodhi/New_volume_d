package SystemJava;

public class second {
  public static void main(String[] args) {
    byte r = -128;
    System.out.println(r);
    Student myobj = new Student();
    System.out.println("Name: " + myobj.name);
    System.out.println("Age: " + myobj.age);
    System.out.println("Graduation year: " + myobj.graduationYear);
    myobj.study();// call the abstract method
  }
}
