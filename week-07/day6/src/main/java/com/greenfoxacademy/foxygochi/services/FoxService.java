package com.greenfoxacademy.foxygochi.services;

import com.greenfoxacademy.foxygochi.models.Fox;
import com.greenfoxacademy.foxygochi.models.FoxHorde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class FoxService {
  public FoxHorde foxes;

  @Autowired
  public FoxService(FoxHorde foxes) {
    this.foxes = foxes;
    foxes.addFox(new Fox("Karak"));
    foxes.addFox(new Fox("Mr. Fox"));
  }

  public void createFox(Fox fox) {
    foxes.addFox(fox);
  }

  public ArrayList<String> getFoodOptions() {
    return new ArrayList<String>(Arrays.asList("pizza", "döner", "mákosguba", "töltött káposzta", "sztrapacska", "fény"));
  }

  public ArrayList<String> getDrinkOptions() {
    return new ArrayList<String>(Arrays.asList("lemonade", "cider", "Irsai Olivér", "vicerozé", "nektár", "Mojito"));
  }

  public ArrayList<String> getTrickOptions() {
    return new ArrayList<String>(Arrays.asList("write HTML", "code in Java", "slack around", "sit in the hammock", "windsurfing", "ride a bike"));
  }
}