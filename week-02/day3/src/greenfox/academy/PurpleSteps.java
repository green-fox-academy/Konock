package greenfox.academy;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 1; i <= 20; i++) {
      drawSquare(graphics, 5 + (10 * i), 5 + (10 * i));
    }
  }

  public static void drawSquare(Graphics graphics, int x, int y) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, 10, 10);
    Color purple = new Color(143, 0, 255);
    graphics.setColor(purple);
    graphics.fillRect(x, y, 10, 10);
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
