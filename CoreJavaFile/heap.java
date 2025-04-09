public class heap {
  public static void main(String[] args) {
    String x1 = "mike";
    String x2 = new String("mike").intern();
    System.out.println(x1 == x2);
    System.out.println(x1.equals(x2));

    String s2 = "    ";
    System.out.println(s2.length());
    String s3 = null;
    System.out.println(s3);
    System.out.println(x2.isBlank());
    System.out.println(x2.isEmpty());
    String p1 = "mike";
    String p2 = "mike";
    String p3 = "Mike";
    System.out.println(p1.equals(p3));
    System.out.println(p1.equalsIgnoreCase(p3));
    System.out.println(p1.equals(p2));

    String x5 = "python";
    String x6 = "java";
    System.out.println(x5.compareTo(x6));

    String t1 = "aabaacv";
    int count = 0;
    for (int i = 0; i < t1.length(); i++) {
      if (t1.charAt(i) == 'a') {
        count++;
      }
      System.out.println(count);
    }

  }
}
