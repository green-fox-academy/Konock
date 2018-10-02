package com.greenfoxacademy.groot;

public class Arrow {
  private Double time;
  private Double distance;
  private Double speed;

  public Arrow() {
  }

  public Arrow(Double time, Double distance) {
    this.time = time;
    this.distance = distance;
    speed = time / distance;
  }

  public Double getTime() {
    return time;
  }

  public void setTime(Double time) {
    this.time = time;
  }

  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }
}
