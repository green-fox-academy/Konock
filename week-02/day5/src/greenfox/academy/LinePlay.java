package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    // Loop for upper part
    for (int i = 0; i < WIDTH; i += 10) {
      int x1 = i;
      int y1 = 0;
      int x2 = WIDTH;
      int y2 = i;
      drawLine(graphics, "purple", x1, y1, x2, y2);
    }
    // Loop for bottom part
    for (int i = 0; i < WIDTH; i += 10) {
      int x1 = i;
      int y1 = HEIGHT;
      int x2 = 0;
      int y2 = i;
      drawLine(graphics, "green", x1, y1, x2, y2);
    }

  }

  public static Graphics drawLine(Graphics graphics, String color, int x1, int y1, int x2, int y2) {
    switch (color) {
      case "purple":
        graphics.setColor(new Color(186,85,211));
        break;
      case "green":
        graphics.setColor(Color.GREEN);
        break;
    }
    graphics.drawLine(x1, y1, x2, y2);
    return graphics;
  }

  public static Graphics drawHLine(Graphics graphics, int x, int y) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x, y, x, y);
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
