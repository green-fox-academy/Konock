package greenfox.academy;

public class Main {

  public static void main(String[] args) {
    Student student1 = new Student();
    student1.introduce();
    Student student2 = student1.clone();
    student2.introduce();
  }
}
