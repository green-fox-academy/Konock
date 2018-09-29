package com.greenfoxacademy.fulvipesorientationexam.services;

import com.greenfoxacademy.fulvipesorientationexam.models.Matrix;
import com.greenfoxacademy.fulvipesorientationexam.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatrixServiceImpl implements MatrixService {
  @Autowired
  MatrixRepository matrixRepository;

  @Override
  public boolean isSquare(Matrix matrix) {
    List<List<Integer>> matrixArray = matrix.getMatrixNumbers();
    boolean isSquare = true;
    for (int i = 0; i < matrixArray.size(); i++) {
      if (matrix.getMatrixNumbers().size() != (matrix.getMatrixNumbers().get(i).size()))
        isSquare = false;
    }
    return isSquare;
  }

  @Override
  public boolean isIncreasing(Matrix matrix) {
    List<List<Integer>> matrixArray = matrix.getMatrixNumbers();
    boolean isIncreasing = false;
    for (int i = 0; i < matrixArray.size() - 1; i++) {
      for (int j = 0; j < matrixArray.size() - 1; j++) {
        if (matrixArray.get(i).get(j) <= matrixArray.get(i + 1).get(j + 1) && matrixArray.get(j).get(i) <= matrixArray.get(j + 1).get(i + 1))
          isIncreasing = true;
      }
    }
    return false;
  }

  @Override
  public void saveMatrix(Matrix matrix) {
    matrixRepository.save(matrix);
  }

  @Override
  public List<Matrix> getMatrixes() {
    return matrixRepository.findAll();
  }
}
