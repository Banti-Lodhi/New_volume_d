import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InputSer {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("D:\\test\\A.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Serilization a1 = (Serilization) ois.readObject();
      System.out.println(a1.name);
      System.out.println(a1.passWord);
      ois.close();
      fis.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
