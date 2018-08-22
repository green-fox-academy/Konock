package greenfox.academy;

public class Student extends Person implements Cloneable {
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
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  Student() {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student clone() {
    Student clone = new Student();
    clone.setName(this.getName());
    clone.setAge(this.getAge());
    clone.setGender(this.getGender());
    clone.previousOrganization = this.previousOrganization;
    clone.skippedDays = this.skippedDays;
    return clone;
  }
}