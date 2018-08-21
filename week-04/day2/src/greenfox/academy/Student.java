package greenfox.academy;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super.setName(name);
    super.setAge(age);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  Student() {
    super.setName("Jane Doe");
    super.setAge(30);
    super.setGender("female");
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
}
