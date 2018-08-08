package greenfox.academy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "lila"};
    int size = HEIGHT;
    for (int i = 0; i < colors.length; i++) {
      size -= 35;
      drawSquare(graphics, size, colors[i]);
    }

  }

  public static void drawSquare(Graphics graphics, int size, String color) {
    switch (color) {
      case "red":
        Color red = new Color(255, 0, 0);
        graphics.setColor(red);
        break;
      case "orange":
        Color orange = new Color(255, 127, 0);
        graphics.setColor(orange);
        break;
      case "yellow":
        Color yellow = new Color(255, 255, 0);
        graphics.setColor(yellow);
        break;
      case "green":
        Color green = new Color(0, 255, 0);
        graphics.setColor(green);
        break;
      case "blue":
        Color blue = new Color(0, 0, 255);
        graphics.setColor(blue);
        break;
      case "purple":
        Color purple = new Color(75, 0, 130);
        graphics.setColor(purple);
        break;
      case "lila":
        Color lila = new Color(143, 0, 255);
        graphics.setColor(lila);
        break;
    }
    graphics.fillRect((WIDTH / 2) - size / 2, (HEIGHT / 2) - size / 2, size, size);
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
