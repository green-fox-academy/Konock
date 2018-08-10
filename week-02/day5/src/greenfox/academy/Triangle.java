package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    // Draw outer triangle
    drawLine(graphics, WIDTH/2, 0, WIDTH, WIDTH);
    drawLine(graphics, WIDTH/2, 0, 0, WIDTH);
    drawLine(graphics, 0, WIDTH, WIDTH, WIDTH);

    // Loop for inner horizontal lines
    for (int i=0; i<WIDTH; i+=20) {
      int x1 = 0+i;
      int y1 = WIDTH-i;
      int x2 = WIDTH-i;
      int y2 = WIDTH-i;
      drawLine(graphics, x1, y1, x2, y2);
    }

  }

  public static Graphics drawLine(Graphics graphics, int x1, int y1, int x2, int y2) {
        graphics.setColor(Color.BLACK);
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
