package greenfox.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  public static String ticTacResult(String filename) {
    Path path = Paths.get(filename);
    List<String> lines = null;
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Create a matrix
    // Add all rows and columns and diagonals into a String array
    // Create for loop for iterating through arrays
    // Check if OOO or XXX appears

    for (int i = 0; i < lines.size(); i++) {
      String[] line = lines.get(i).split("");
      if (lines.get(i).equals("OOO") || lines.get(i).startsWith("O") || line[i].equals("O")) {
        return "O wins";
      } else if (lines.get(i).equals("XXX") || lines.get(i).startsWith("X") || line[i].equals("X")) {
        return "X wins";
      } else {
        return "Draw";
      }
    }
  }
}
