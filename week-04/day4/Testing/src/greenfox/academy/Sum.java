package greenfox.academy;

import java.util.ArrayList;

public class Sum {

  public ArrayList<Integer> initList(int... ints) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int num : ints) {
      list.add(num);
    }
    return list;
}
  public int sumInt(ArrayList<Integer> ints) {
    int sum = 0;
    for (int num : ints) {
      sum += num;
    }
    return sum;
  }
}
