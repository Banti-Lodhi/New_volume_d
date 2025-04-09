import java.io.BufferedWriter;
import java.io.FileWriter;

public class Lecture6 {
  public static void main(String[] args) {
    try {
      // FileReader Fumction-

      // File f = new File("D:\\test\\contents.txt");
      // FileReader fr = new FileReader(f);
      // char[] ch = new char[(int) f.length()];
      // fr.read(ch);
      // for (char x : ch) {
      // System.out.print(x + "");
      // }

      // FileWriter Function
      // FileWriter fw = new FileWriter("D:\\test\\attribute.txt", true);
      // fw.write(97);
      // fw.write("\nmike\n");
      // fw.write(100);
      // System.out.println();
      // char[] x = { 's', 'f', 't' };
      // fw.write(x);
      // fw.close();
      // }

      // BufferReader
      // FileReader fr = new FileReader("D:\\test\\attribute.txt");
      // BufferedReader br = new BufferedReader(fr);
      // System.out.println((char) cr.read());
      // char[] ch = { 'p', 'r', 'e' };
      // fr.read(ch);
      // for (char x : ch) {
      // System.out.println(x);
      // }
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());

      // Buffered File Writer
      FileWriter fw = new FileWriter("D:\\test\\attribute.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(100);
      bw.newLine();
      bw.write("Preetam Singh");
      bw.newLine();
      char[] ch = { 'b', 'f', 'a' };
      bw.write(ch);
      bw.newLine();
      bw.write(1000); 
      bw.close();
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
