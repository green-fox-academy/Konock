package greenfox.academy;

public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    double side1 = 3;
    double side2 = 2;
    double side3 = 4;
    double surfaceArea = 2*(side1+side2+side3);
    double volume = side1*side2*side3;
    System.out.println("Surface Area: " + Math.round(surfaceArea));
    System.out.println("Volume: " + Math.round(volume));
  }
}
