package com.greenfoxacademy.corsacorientationexam.repositories;

import com.greenfoxacademy.corsacorientationexam.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
  Spaceship findById(long id);
}
