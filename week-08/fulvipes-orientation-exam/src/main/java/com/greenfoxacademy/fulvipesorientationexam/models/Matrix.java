package com.greenfoxacademy.fulvipesorientationexam.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Matrix {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  private LocalDateTime saveDate;
  private String matrixNumbers;

  public Matrix() {
  }

  public Matrix(String matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getSaveDate() {
    return saveDate;
  }

  public void setSaveDate(LocalDateTime saveDate) {
    this.saveDate = saveDate;
  }

  public String getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(String matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }
}
