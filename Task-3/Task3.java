public class Task3 {

  public static void main(String[] args) {

    String a = new String("Wow");
    String b = "Wow";
    String c = a;
    String d = c;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    System.out.println("\n");

    // boolean b1 = a == b;
    boolean b1 = a.contentEquals(b);
    System.out.println(b1);

    // boolean b2 = d.equals(b + "!");
    boolean b2 = d.equals(b);
    System.out.println(b2);

    boolean b3 = c.contains(a);
    System.out.println(b3);

    System.out.println("\n");

    if (b1 && b2 && b3) {
      System.out.println("Success!");
    }
  }
}