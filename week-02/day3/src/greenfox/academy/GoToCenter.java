package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 0; i < 3; i++) {
      int x = 0;
      int y = 0;
      x += 20 * i;
      y += 50 * i;
      drawLine(graphics, x, y);
    }

  }

  public static Graphics drawLine(Graphics graphics, int x, int y) {
    graphics.setColor(Color.BLACK);
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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
