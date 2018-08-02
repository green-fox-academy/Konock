package greenfox.academy;

public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    int dailyCodeHours = 6;
    // The semester is 17 weeks long
    int semesterLength = 17;
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    int codingHours = (dailyCodeHours * 5) * semesterLength;
    System.out.println("A Green Fox attendee codes " + codingHours + " hours during the whole semester.");
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    int averageCodeHours = 52*semesterLength;
    double weekHours = 168;
    System.out.println("A Green Fox attendee spends " + Math.round(((averageCodeHours / (weekHours*semesterLength))*100)) + " % of the semester with coding.");
  }
}
