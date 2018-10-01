package com.greenfoxacademy.restexercises.repositories;

import com.greenfoxacademy.restexercises.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, LocalDateTime> {
  List<Log> findAll();
}
