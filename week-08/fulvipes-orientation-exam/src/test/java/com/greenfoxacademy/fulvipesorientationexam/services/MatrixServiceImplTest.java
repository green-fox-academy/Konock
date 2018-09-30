package com.greenfoxacademy.fulvipesorientationexam.services;

import com.greenfoxacademy.fulvipesorientationexam.models.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class MatrixServiceImplTest {
  MatrixServiceImpl matrixService = new MatrixServiceImpl();
  Matrix matrix = new Matrix("1, 2, 3, 4, 5, 6, 7, 8, 9");
  Matrix nonSquareMatrix = new Matrix("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
  Matrix nonIncreasingMatrix = new Matrix("1, 2, 3, 7, 8, 9, 4, 5, 6");

  @Test
  public void toNumbers() {
    matrixService.toNumbers(matrix).stream()
        .forEach(System.out::println);
  }

  @Test
  public void toMatrixArray() {
    matrixService.toMatrixArray(matrix).stream()
        .forEach(System.out::println);
  }

  @Test
  public void isSquare() {
    Assert.assertFalse(matrixService.isSquare(nonSquareMatrix));
  }

  @Test
  public void isIncreasing() {
    Assert.assertFalse((matrixService.isIncreasing(nonIncreasingMatrix)));
    Assert.assertTrue((matrixService.isIncreasing(matrix)));
  }
}