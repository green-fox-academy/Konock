package com.greenfoxacademy.foxygochi.models;

import java.util.ArrayList;

public class FoxHorde {
  private ArrayList<Fox> foxHorde;

  public FoxHorde() {
    foxHorde = new ArrayList<>();
  }

  public void addFox(Fox fox) {
    foxHorde.add(fox);
  }

  public Fox getFoxByName(String name) {
    for (Fox fox : foxHorde) {
      if (fox.getName().equals(name))
        return fox;
    }
    return null;
  }
}
