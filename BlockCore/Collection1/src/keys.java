import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class keys {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "John Doe";
    person.last_name = "Shina";
    person.age = 23;
    person.accessCode = 2034;

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    try {
      ObjectOutputStream object = new ObjectOutputStream(output);
      object.writeObject(person);
    } catch (Exception e) {
      e.printStackTrace();
    }

    Person person2 = new Person();

    try {
      ObjectInputStream objectIn = new ObjectInputStream(new ByteArrayInputStream(output.toByteArray()));
      person2 = (Person) objectIn.readObject();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(person2.name);
    System.out.println(person2.last_name);
    System.out.println(person2.age);
    System.out.println(person2.accessCode);
    System.out.println(person.name);
    System.out.println(person.last_name);
    System.out.println(person.age);
    System.out.println(person.accessCode);
  }
}

class Person implements Serializable {
  String name = "John";
  String last_name = "Doe";
  int age = 24;
  transient int accessCode = 0;
}