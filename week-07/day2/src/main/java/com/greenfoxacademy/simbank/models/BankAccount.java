package com.greenfoxacademy.simbank.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean ownerKing;
  private boolean goodGuy;

  public BankAccount() {
    new BankAccount(null, 0, null, false);
    goodGuy = true;
  }


  public BankAccount(String name, int balance, String animalType, boolean ownerIsKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.ownerKing = ownerIsKing;
    goodGuy = true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isOwnerKing() {
    return ownerKing;
  }

  public void setOwnerKing(boolean ownerKing) {
    this.ownerKing = ownerKing;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    this.goodGuy = goodGuy;
  }

  public void addCurrency() {
    if (ownerKing)
      balance += 100;
    else
      balance += 10;
  }
}
