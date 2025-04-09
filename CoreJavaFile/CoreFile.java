import java.io.File;

public class CoreFile {
  public static void main(String[] args) {

    // Exists File:-
    // File f = new File("D:\\Advance Java\\Core Java Course\\Array.java");
    // boolean val = f.exists();
    // System.out.println(val);

    // Create New File:-
    // File f = new File("D:\\Advance Java\\CoreJavaFile\\SortArray.java");
    // try {
    // boolean val = f.createNewFile();
    // System.out.println(val);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // Delete File

    // File f = new File("D:\\Advance Java\\CoreJavaFile\\SortArray.java");
    // try {
    // boolean val = f.delete();
    // System.out.println(val);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // mkdir method:-
    // File f = new File("D:\\Advance Java\\CoreJavaFile\\SystemJava");
    // boolean file = f.mkdir();
    // System.out.println(file);

    // List File:-
    File f = new File("D:\\Advance Java\\CoreJavaFile\\CoreFile.java");
    long file = f.length();
    System.out.println(file);
  }
}
