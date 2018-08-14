package greenfox.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFiles {
  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {
    System.out.println(copy("my-file.txt", "my-file-copied.txt"));
  }

  public static boolean copy(String filename1, String filename2) {
    Path path1 = Paths.get(filename1);
    Path path2 = Paths.get(filename2);
    try {
      List<String> content = Files.readAllLines(path1);
      Files.write(path2, content);
    } catch (IOException e) {
      return false;
    }
    return true;
  }
}
