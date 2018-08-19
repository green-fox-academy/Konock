
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {
  public static void mainDraw(Graphics graphics) {
    int size = WIDTH/3;
    drawCarpet(WIDTH/2 - size / 2, HEIGHT / 2 - size / 2, size, graphics);
  }

  public static Graphics drawSquare(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
    return graphics;
  }

  public static void drawCarpet(int x, int y, int size, Graphics graphics) {
    drawSquare(x, y, size, graphics);
    if (size < 50) {
    } else {
      drawCarpet(x - size, y - size, size / 2, graphics);
      drawCarpet(x + size / 2, y - size, size / 2, graphics);
      drawCarpet(x + size, y - size, size / 2, graphics);
      // drawCarpet(x + size / 4, y, size / 2, graphics);
      // drawCarpet(x + size / 4, y, size / 2, graphics);
      // drawCarpet(x + size / 4, y, size / 2, graphics);
      // drawCarpet(x + size / 4, y, size / 2, graphics);
      // drawCarpet(x + size / 4, y, size / 2, graphics);
    }
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
