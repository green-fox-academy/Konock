package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    // This is a set of horizontal and vertical straight(!) lines
    // with a differing starting point on x and y coordinates
    // the end points are aligned in a way that it shows a curve
    //
    // Create a method for drawing the horizontal and vertical lines
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

  }

  public static Graphics drawVLine(Graphics graphics, int x, int y) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x, y, x, y);
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
