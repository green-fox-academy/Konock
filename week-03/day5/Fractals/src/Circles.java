
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {
    int size = 400;
    drawCircles(0, 0, size, graphics);
  }

  public static Graphics drawCircle(int x, int y, int size, Graphics graphics) {
    graphics.drawOval(x, y, size, size);
    return graphics;
  }

  public static void drawCircles(int x, int y, int size, Graphics graphics) {
    drawCircle(x, y, size, graphics);
    if (size < 50) {
    } else {
      drawCircles(x + size / 4, y, size / 2, graphics);
      drawCircles(x + 3, y + size / 3, size / 2, graphics);
      drawCircles(x + size / 2, y + size / 3, size / 2, graphics);
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
