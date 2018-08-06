package greenfox.academy;

public class DiagonalMatrix {
  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output

  // How to initialize multidimensional arrays:
  // String[][] myStringArray = new String [x][y];

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    for (int putOne = 0; putOne < 4; putOne++) {
      matrix[putOne][putOne] = 1;
    }

    printMatrix(matrix);
  }

  public static void printMatrix(int x[][]) {
    for (int row = 0; row < x.length; row++) {
      for (int column = 0; column < x[row].length; column++) {
        System.out.print(x[row][column] + " ");
      }
      System.out.println("");
    }
  }
}
