package com.greenfoxacademy.restexercises.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sithspeak {
  private String text;
  private String sithText;

  public Sithspeak() {
  }

  public Sithspeak(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getSithText() {
    return sithText;
  }

  public void setSithText(String text) {
    sithText = "";
    List<String> sentences = new ArrayList<>(Arrays.asList(text.split(".")));
    List<List<String>> words = new ArrayList<>();
    for (String sentence : sentences) {
      words.add(Arrays.asList(sentence.split(" ")));
    }

  }
}
