package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    // Loop 1 for upper part
    for (int i = 0; i < WIDTH / 2; i += 10) {
      int x1 = WIDTH / 2;
      int y1 = 0 + i;
      int x2 = WIDTH / 2 + i;
      int y2 = WIDTH / 2;
      drawLine(graphics, x1, y1, x2, y2);
    }
    // Loop 2 for upper part
    for (int i = 0; i < WIDTH / 2; i += 10) {
      int x1 = WIDTH / 2;
      int y1 = 0 + i;
      int x2 = WIDTH / 2 - i;
      int y2 = WIDTH / 2;
      drawLine(graphics, x1, y1, x2, y2);
    }
    // // Loop 1 for bottom part
    for (int i = 0; i < WIDTH / 2; i += 10) {
      int x1 = WIDTH / 2;
      int y1 = WIDTH - i;
      int x2 = WIDTH / 2 + i;
      int y2 = WIDTH / 2;
      drawLine(graphics, x1, y1, x2, y2);
    }
    // Loop 2 for bottom part
    for (int i = 0; i < WIDTH / 2; i += 10) {
      int x1 = WIDTH / 2;
      int y1 = WIDTH - i;
      int x2 = WIDTH / 2 - i;
      int y2 = WIDTH / 2;
      drawLine(graphics, x1, y1, x2, y2);
    }
  }

  public static Graphics drawLine(Graphics graphics, int x1, int y1, int x2, int y2) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x1, y1, x2, y2);
    return graphics;
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
