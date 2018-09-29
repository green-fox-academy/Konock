package com.greenfoxacademy.fulvipesorientationexam.repositories;

import com.greenfoxacademy.fulvipesorientationexam.models.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix, Long> {
  List<Matrix> findAll();
}
