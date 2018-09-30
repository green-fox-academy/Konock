package com.greenfoxacademy.fulvipesorientationexam.services;

import com.greenfoxacademy.fulvipesorientationexam.models.Matrix;

import java.util.ArrayList;
import java.util.List;

public interface MatrixService {
  ArrayList<Integer> toNumbers(Matrix matrix);
  boolean isSquare(Matrix matrix);
  boolean isIncreasing(Matrix matrix);
  void saveMatrix(Matrix matrix);
  List<Matrix> getMatrixes();
}
