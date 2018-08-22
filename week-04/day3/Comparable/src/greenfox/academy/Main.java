package greenfox.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);
    System.out.println(sortDominoes(dominoes));
    System.out.println(dominoes.get(0).compareTo(4));
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

  static List<Domino> sortDominoes(List<Domino> dominoes) {
    List<Domino> sortedDominoes = new ArrayList<>();
    sortedDominoes.add(dominoes.get(0));
    while (sortedDominoes.size() != dominoes.size()) {
      for (int i = 1; i < dominoes.size(); i++) {
        if (sortedDominoes.get(sortedDominoes.size() - 1).getValues()[1] == dominoes.get(i).getValues()[0]) {
          sortedDominoes.add(dominoes.get(i));
        }
      }
    }
    return sortedDominoes;
  }
}
