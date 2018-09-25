package com.greenfoxacademy.mysqlconnection.repositories;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(boolean done);
  Todo findById(long id);

}
