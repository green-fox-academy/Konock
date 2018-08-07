package greenfox.academy;

public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(reverse(reversed));
    System.out.println(reverse2(reversed));
  }

  public static String reverse(String text) {
    String reverseText = "";
    for (int i=text.length()-1; i>=0; i--) {
      reverseText += text.charAt(i);
    }
    return reverseText;
  }

  public static StringBuilder reverse2(String text) {
    StringBuilder reversedText = new StringBuilder(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");
    reversedText.reverse();
    return reversedText;
  }
}
