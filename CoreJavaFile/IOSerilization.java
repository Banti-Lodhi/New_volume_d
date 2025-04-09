import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class IOSerilization {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("D:\\test\\A.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      Serilization a = new Serilization();
      oos.writeObject(a);
      oos.close();
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
