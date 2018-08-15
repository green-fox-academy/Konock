package greenfox.academy;

public class Teacher {

  void teach(Student student) {
    System.out.println("Teaching stuff");
    student.learn();
  }

  void answer() {
    System.out.println("The answer to your question is...");
  }
}
