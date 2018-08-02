package greenfox.academy;

public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10
    a += 10;

    System.out.println(a);


    int b = 100;
    // make it smaller by 7
    b -= 7;

    System.out.println(b);


    int c = 44;
    // please double c's value
    c = c * 2;

    System.out.println(c);


    int d = 125;
    // please divide by 5 d's value
    d = d / 5;

    System.out.println(d);


    double e = 8;
    // please cube of e's value
    e = Math.pow(e, 2);

    System.out.println(e);


    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    boolean isBiggerThan = f1 > f2;
    System.out.println(isBiggerThan);


    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    boolean isDoubleBigger = g2 * 2 > g1;
    System.out.println(isDoubleBigger);

    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)
    boolean divisorEleven = h % 11 == 0;

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    double i2Square = Math.pow(i2, 2);
    double i2Cube = Math.pow(i2, 3);
    boolean i1BiggerThan = i1 > i2Square && i1 < i2Cube;
    System.out.println(i1BiggerThan);

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    boolean jDividable = (j % 3 == 0) || (j % 5 == 0);
    System.out.println(jDividable);

    String k = "Apple";
    //fill the k variable with its content 4 times
    k = k+k+k+k;


    System.out.println(k);
  }
}
