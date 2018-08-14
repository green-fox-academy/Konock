package greenfox.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP addresses.
  // Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    Path path = Paths.get("log.txt");
    try {
      List<String> content = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static List<String> uniqueIP(List<String> content) {

  }
}
