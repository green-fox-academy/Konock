package greenfox.academy;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  Sponsor(String name, int age, String gender, String company) {
    super.setName(name);
    super.setAge(age);
    super.setGender(gender);
    this.company = company;
    hiredStudents = 0;
  }

  Sponsor() {
    super.setName("Jane Doe");
    super.setAge(30);
    super.setGender("female");
    company = "Google";
    hiredStudents = 0;
  }
}
