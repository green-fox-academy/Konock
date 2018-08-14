package greenfox.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a file name: ");
    String filename = scanner.nextLine();
    Path path = Paths.get(filename);
    List<String> lines = null;
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("This is not readable, enter a valid filename: ");
    }
    for (String line : lines) {
      System.out.println(line);
    }
  }
}
