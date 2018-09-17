package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private static AtomicLong count = new AtomicLong(0);
  private long id;
  private String name;
  private String content;
  Attribute lang = new Attribute();

  public Greeting(String name) {
    id = count.getAndIncrement();
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public String getName() {
    return name;
  }
}
