package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class checkerBoard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    int x = 0;
    int y = 0;
    for (int i=0; i<8; i++) {
      if (i == 0 || i % 2 == 0) { // Even rows
        for (int j = 0; j<8; j++) {
          if (j == 0 || j % 2 == 0) { // Even columns
            drawSquare(graphics, "white", x, y);
            } else { // Odd columns
            drawSquare(graphics, "black", x, y);
          }
          x += WIDTH/8;
        }
      } else { // Odd rows
          for (int k = 0; k<8; k++) {
            if (k == 0 || k % 2 == 0) { // Even columns
              drawSquare(graphics, "black", x, y);
            } else { // Odd columns
              drawSquare(graphics, "white", x, y);
            }
            x += WIDTH/8;
          }
      }
      y += WIDTH/8;
      x = 0;
    }


  }

  public static void drawSquare(Graphics graphics, String color, int x, int y) {
    if (color == "white") {
      graphics.setColor(Color.WHITE);
    } else if (color == "black") {
      graphics.setColor(Color.BLACK);
    }
    graphics.fillRect(x, y,  WIDTH/8, WIDTH/8);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
