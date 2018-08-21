package greenfox.academy;

public class Mentor extends Person {
  private String level;

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + ", " + level + " mentor.");
  }

  Mentor(String name, int age, String gender, String level) {
    super.setName(name);
    super.setAge(age);
    super.setGender(gender);
    this.level = level;
  }

  Mentor() {
    super.setName("Jane Doe");
    super.setAge(30);
    super.setGender("female");
    level = "intermediate";
  }

}
