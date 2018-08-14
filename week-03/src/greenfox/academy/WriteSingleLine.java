package greenfox.academy;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    ArrayList<String> content = new ArrayList<>();
    content.add("Kinga Bori");
    Path filename = Paths.get("my-file.txt");
    try {
      Files.write(filename, content);
    } catch (IOException e) {
      System.out.println("Unable to write file.");
    }

  }
}