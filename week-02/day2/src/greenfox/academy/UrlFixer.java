package greenfox.academy;

public class UrlFixer {

  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    String urlReplaced = url.replace("//", "://" );
    String urlReplaced2 = urlReplaced.replace("bots", "odds");

    System.out.println(urlReplaced2);

    StringBuilder url2 = new StringBuilder("https//www.reddit.com/r/nevertellmethebots");
    url2.insert(5, ":");
    System.out.println(url2.indexOf("bots"));
    url2.replace(39, 43, "odds");
    System.out.println(url2);

    String url3 = url;
    url3 = url3.substring(0, 5) + ":" + url3.substring(5);
  }
}
