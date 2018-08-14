package greenfox.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.
    ticTacResult("win-o.txt");
    // System.out.println(ticTacResult("win-o.txt"));
    // should print O

    // System.out.println(ticTacResult("win-x.txt"));
    // should print X

    // System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  public static void ticTacResult(String filename) {
    Path path = Paths.get(filename);
    List<String> lines = null;
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Create a matrix
    ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
    for (int i = 0; i < 3; i++) {
      String[] line = lines.get(i).split("");
      matrix.add(new ArrayList<String>(Arrays.asList(line)));
    }
    // Add all rows and columns and diagonals into a String array
    ArrayList<String> rcd = new ArrayList<String>();
    for (int i = 0; i < matrix.size(); i++) {
      for (int j = 0; j < matrix.size(); j++) {
        rcd.add(matrix.get(i).get(j));
      }

    }
    // Create for loop for iterating through arrays
    // Check if OOO or XXX appears


  }
}
