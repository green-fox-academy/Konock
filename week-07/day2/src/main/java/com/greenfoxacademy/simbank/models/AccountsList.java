package com.greenfoxacademy.simbank.models;

import java.util.ArrayList;

public class AccountsList {
  ArrayList<BankAccount> accounts = new ArrayList<>();

  public AccountsList() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true));
    accounts.add(new BankAccount("Timon", 1, "meercat", false));
    accounts.add(new BankAccount("Pumba", 2, "hog", false));
    accounts.add(new BankAccount("Nala", 500, "lion", false));
  }

  public void add(BankAccount account) {
    accounts.add(account);
  }

  public BankAccount get(int index) {
    return accounts.get(index);
  }

  public ArrayList<BankAccount> getAccounts() {
    return accounts;
  }
}
