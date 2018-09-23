package com.greenfoxacademy.foxygochi.services;

import com.greenfoxacademy.foxygochi.models.Fox;
import com.greenfoxacademy.foxygochi.models.FoxHorde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  public FoxHorde foxes;

  @Autowired
  public FoxService(FoxHorde foxes) {
    this.foxes = foxes;
  }

  public void createFox(Fox fox) {
    foxes.addFox(fox);
  }
}