package com.greenfoxacademy.fulvipesorientationexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Matrix {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  private Date saveDate;
  private List<List<Integer>> matrixNumbers;

  public Matrix() {
    matrixNumbers = new ArrayList<>();
  }

  public Matrix(List<List<Integer>> matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getSaveDate() {
    return saveDate;
  }

  public void setSaveDate(Date saveDate) {
    this.saveDate = saveDate;
  }

  public List<List<Integer>> getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(List<List<Integer>> matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }
}
