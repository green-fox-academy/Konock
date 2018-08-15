package greenfox.academy;

public class Student {

  void learn() {
    System.out.println("Processing...");
  }

  void question(Teacher teacher) {
    System.out.println("I have a question...");
    teacher.answer();
  }
}
