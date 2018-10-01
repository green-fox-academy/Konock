package com.greenfoxacademy.restexercises.models;

public class Dountil {
  private int until;
  private int result;

  public Dountil() {
  }

  public Dountil(int until) {
    this.until = until;
  }

  public int sum() {
    this.result = 0;
    for (int i = 0; i <= until; i++) {
      this.result += i;
    }
    return result;
  }

  public int factor() {
    this.result = 1;
    for (int i = 1; i <= until; i++) {
      this.result *= i;
    }
    return result;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
