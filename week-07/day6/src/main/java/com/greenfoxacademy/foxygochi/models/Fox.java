package com.greenfoxacademy.foxygochi.models;

import java.util.ArrayList;

public class Fox {
  private String name;
  private String food;
  private String drink;
  private ArrayList<String> tricks;

  public Fox() {
    food = "pizza";
    drink = "lemonade";
    tricks = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    food = "pizza";
    drink = "lemonade";
    tricks = new ArrayList<>();
  }

  public void addTrick(String trick) {
    if (!tricks.contains(trick))
      tricks.add(trick);
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
  }
}

