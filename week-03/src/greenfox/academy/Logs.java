package greenfox.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP addresses.
  // Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    Path path = Paths.get("log.txt");
    List<String> content = null;
    try {
      content = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(uniqueIP(content));
    System.out.println(ratio(content));
  }

  public static List<String> uniqueIP(List<String> content) {
    List<String> unique = new ArrayList<>();
    for (int i = 0; i < content.size(); i++) {
      String[] line = content.get(i).split(" ");
      if (!unique.contains(line[8]))
        unique.add(line[8]);
    }
    return unique;
  }

  public static double ratio(List<String> content) {
    int post = 0;
    int get = 0;
    for (int i = 0; i < content.size(); i++) {
      if (content.get(i).contains("POST")) {
        post++;
      } else if (content.get(i).contains("GET")) {
        get++;
      }
    }
    double ratio = (double) get / post;
    ratio = Double.parseDouble(new DecimalFormat("##.##").format(ratio));
    return ratio;
  }
}
