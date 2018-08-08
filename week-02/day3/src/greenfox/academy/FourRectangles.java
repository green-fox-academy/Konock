package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    // avoid code duplication.
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 0; i < 4; i++) {
      Color myColor = new Color(((int) (Math.random() * 255)), ((int) (Math.random() * 255)), ((int) (Math.random() * 255)));
      int x = ((int) (Math.random() * 100));
      int y = ((int) (Math.random() * 100));
      int w = ((int) (Math.random() * WIDTH/2));
      int h = ((int) (Math.random() * HEIGHT/2));
      graphics.setColor(myColor);
      graphics.fillRect(x, y, w, h);
    }
  }

  //    Don't touch the code below
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
