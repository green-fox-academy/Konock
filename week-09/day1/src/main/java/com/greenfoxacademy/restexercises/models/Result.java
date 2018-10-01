package com.greenfoxacademy.restexercises.models;

import java.util.List;

public class Result {
  private int result;
  private List<Integer> results;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public Result(List<Integer> results) {
    this.results = results;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public List<Integer> getResults() {
    return results;
  }

  public void setResults(List<Integer> results) {
    this.results = results;
  }
}
