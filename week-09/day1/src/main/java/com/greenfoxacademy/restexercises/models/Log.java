package com.greenfoxacademy.restexercises.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {
  @Id
  private LocalDateTime createdAt;
  private String endpoint;
  private String data;

  public Log() {
  }

  public Log(String endpoint, String data) {
    createdAt = LocalDateTime.now();
    this.endpoint = endpoint;
    this.data = data;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
