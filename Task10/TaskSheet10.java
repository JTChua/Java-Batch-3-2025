package Task10;

public class TaskSheet10 {

  public static void main(String[] args) {

    Student[] students = new Student[] {
        new Student("Morgan", "Freeman"),
        new Student("Brad", "Pitt"),
        new Student("Kevin", "Spacey")
    };

    for (Student s : students) {
      System.out.println(s.printFullName());
    }

  }
}
