package SystemJava;

abstract class abs {
  public String name = "john";
  public int age = 29;

  public abstract void study();
}

// Subclass(inherit to another class)
class Student extends abs {
  public int graduationYear = 2018;

  public void study() { // the body of abstract method is provided here
    System.out.println("Studying all day long");
  }
}
