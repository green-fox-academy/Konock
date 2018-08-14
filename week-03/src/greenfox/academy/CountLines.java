package greenfox.academy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.
  public static void main(String[] args) {
    String filename = "my-file.txt";
    System.out.println(countLines(filename));
    String filename2 = "my-file2.txt";
    System.out.println(countLines(filename2));

  }

  public static int countLines(String filename) {
    int countLines = 0;
    Path path = Paths.get(filename);
    List<String> lines = null;
    try {
      lines = Files.readAllLines(path);
      for (String line : lines) {
        countLines++;
      }
    } catch (Exception e) {
    }
    return countLines;
  }
}
