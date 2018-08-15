package greenfox.academy;

public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  void printBlogPost() {
    System.out.println(title + " titled by " + authorName + " posted at " + publicationDate);
    System.out.println("\t" + text);
  }
}
