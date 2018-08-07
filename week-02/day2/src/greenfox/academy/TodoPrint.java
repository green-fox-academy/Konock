package greenfox.academy;

public class TodoPrint {

  public static void main(String... args){
    StringBuilder todoText = new StringBuilder(" - Buy milk\n");
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    todoText.insert(0, "My todo:\n\t");
    todoText.append("\t - Download games\n");
    todoText.append("\t\t - Diablo");

    System.out.println(todoText);
  }
}
