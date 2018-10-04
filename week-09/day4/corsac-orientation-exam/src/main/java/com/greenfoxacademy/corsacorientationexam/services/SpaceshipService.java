package com.greenfoxacademy.corsacorientationexam.services;

import com.greenfoxacademy.corsacorientationexam.models.Planet;
import com.greenfoxacademy.corsacorientationexam.models.Spaceship;
import com.greenfoxacademy.corsacorientationexam.repositories.PlanetRepository;
import com.greenfoxacademy.corsacorientationexam.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceshipService {
  @Autowired
  SpaceshipRepository spaceshipRepository;
  @Autowired
  PlanetRepository planetRepository;

  public List<Planet> getPlanets() {
    return planetRepository.findAll();
  }

  public Spaceship getSpaceship() {
    return spaceshipRepository.findById((long)1);
  }

  public void moveSpaceship(long id) {
    Spaceship spaceship = getSpaceship();
    spaceship.setPlanet(planetRepository.findById(id).getName());
    spaceshipRepository.save(spaceship);
  }
}
