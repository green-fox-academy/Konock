package com.greenfoxacademy.fulvipesorientationexam.services;

import com.greenfoxacademy.fulvipesorientationexam.models.Matrix;
import com.greenfoxacademy.fulvipesorientationexam.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatrixServiceImpl implements MatrixService {
  @Autowired
  MatrixRepository matrixRepository;

  @Override
  public ArrayList<Integer> toNumbers(Matrix matrix) {
    ArrayList<Integer> numbers = new ArrayList<>();
    String[] chars = matrix.getMatrixNumbers().split("");
    for (String character : chars) {
      try {
        numbers.add(Integer.parseInt(character));
      }
      catch(NumberFormatException e) {
      }
    }
    return numbers;
  }

  public ArrayList<ArrayList<Integer>> toMatrixArray(Matrix matrix) {
    ArrayList<ArrayList<Integer>> matrixArray = new ArrayList<>();
    int rowNumber = (int) Math.sqrt(toNumbers(matrix).size());
    for (int i = 0; i < rowNumber; i++) {
      matrixArray.add(new ArrayList<>());
      for (int j = i * rowNumber; j <  rowNumber + (3*i); j++) {
        matrixArray.get(i).add(toNumbers(matrix).get(j));
      }
    }
    return matrixArray;
  }

  @Override
  public boolean isSquare(Matrix matrix) {
    return (Math.sqrt(toNumbers(matrix).size()) % 1 == 0);
  }

  @Override
  public boolean isIncreasing(Matrix matrix) {
    boolean isIncreasing = false;
    ArrayList<ArrayList<Integer>> matrixArray = toMatrixArray(matrix);
    for (int i = 0; i < matrixArray.size() - 1; i++) {
      for (int j = 0; j < matrixArray.size() - 1; j++) {
        if (matrixArray.get(i).get(j) <= matrixArray.get(i + 1).get(j + 1) && matrixArray.get(j).get(i) <= matrixArray.get(j + 1).get(i + 1))
          isIncreasing = true;
        else
          isIncreasing = false;
      }
    }
    return isIncreasing;
  }

  @Override
  public void saveMatrix(Matrix matrix) {
    if (isSquare(matrix) && isIncreasing(matrix)) {
      matrix.setSaveDate(LocalDateTime.now());
      matrixRepository.save(matrix);
    }
  }

  @Override
  public List<Matrix> getMatrixes() {
    return matrixRepository.findAll();
  }
}
