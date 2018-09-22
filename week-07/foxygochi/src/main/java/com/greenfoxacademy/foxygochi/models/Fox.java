package com.greenfoxacademy.foxygochi.models;

import java.util.ArrayList;

public class Fox {
  private String name;
  private String food;
  private String drink;
  private ArrayList<String> tricks;

  public Fox() {
    tricks = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    tricks = new ArrayList<>();
  }

  public void addTrick(String trick) {
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
