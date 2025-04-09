package SystemJava;

public class asserts {
  public static void main(String[] args) {
    ClassLoader loader = ClassLoader.getSystemClassLoader();
    loader.setDefaultAssertionStatus(true);

    assertExample obj = new assertExample();
    obj.run();
  }
}

class assertExample {
  public void run() {
    int i = 10;
    try {
      assert i == 10; // asseration without fail method
      assert i == 10 : "a is not 12"; // i is not 10
      assert i == 15 : "a is not 15"; // i is not 15

    } catch (AssertionError e) {
      e.printStackTrace();
    }
  }
}