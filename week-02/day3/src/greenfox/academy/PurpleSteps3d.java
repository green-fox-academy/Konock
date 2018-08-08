package greenfox.academy;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    int coord = 5;
    for (int i = 1; i <= 6; i++) {
      int size = i*10;
      coord += size-10;
      draw3dSquare(graphics, coord, size);
    }
  }

  public static void draw3dSquare(Graphics graphics, int x, int size) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x, x,  size, size);
    Color purple = new Color(143, 0, 255);
    graphics.setColor(purple);
    graphics.fill3DRect(x, x,  size, size, true);
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
