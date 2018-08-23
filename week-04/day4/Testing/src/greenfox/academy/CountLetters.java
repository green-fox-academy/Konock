package greenfox.academy;

import java.util.HashMap;

public class CountLetters {
  String word;

  public CountLetters(String word) {
    this.word = word;
  }

  public HashMap countLetters() {
    HashMap dic = new HashMap();
    String[] letters = this.word.split("");
    int occurrence = 0;
    for (String letter : letters) {
      if (!dic.containsKey(letter))
        dic.put(letter, occurrence+1);
      else if (dic.containsKey(letter))
        dic.put(letter, dic.get(occurrence++));
    }
    return dic;
  }
}
