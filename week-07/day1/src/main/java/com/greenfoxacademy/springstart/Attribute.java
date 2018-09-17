package com.greenfoxacademy.springstart;

import java.util.Random;

public class Attribute {
  private int fontSize;
  private String fontColor;
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  Random random = new Random();

  public Attribute() {
  }

  public String getHello() {
    int helloID = random.nextInt(hellos.length);
    return hellos[helloID];
  }

  public int getFontSize() {
    fontSize = random.nextInt(18) + 6;
    return fontSize;
  }

  public String getFontColor() {
    int nextInt = random.nextInt(0xffffff + 1);
    fontColor = String.format("#%06x", nextInt);
    return fontColor;
  }
}
