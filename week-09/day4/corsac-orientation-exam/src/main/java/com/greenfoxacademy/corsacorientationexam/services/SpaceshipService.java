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
    return spaceshipRepository.findById((long) 1);
  }

  public void moveSpaceship(long id) {
    Spaceship spaceship = getSpaceship();
    if (!planetRepository.findById(id).getName().equals(spaceship.getPlanet()))
      spaceship.setPlanet(planetRepository.findById(id).getName());
    spaceshipRepository.save(spaceship);
  }

  public void moveToShip(long id) {
    Planet planet = planetRepository.findById(id);
    Spaceship spaceship = getSpaceship();
    if (spaceship.getPlanet().equals(planet.getName())) {
      int freeCapacity = spaceship.getMax_capacity() - spaceship.getUtilization();
      if (freeCapacity > 0 && freeCapacity > planet.getPopulation()) {
        planet.setPopulation(0);
        spaceship.setUtilization((int) planet.getPopulation());
      } else if (freeCapacity > 0 && freeCapacity <= planet.getPopulation()) {
        planet.setPopulation(planet.getPopulation() - freeCapacity);
        spaceship.setUtilization(spaceship.getUtilization() + freeCapacity);
      }
      planetRepository.save(planet);
      spaceshipRepository.save(spaceship);
    }
  }

  public void moveToPlanet(long id) {
    Planet planet = planetRepository.findById(id);
    Spaceship spaceship = getSpaceship();
    planet.setPopulation(planet.getPopulation() + spaceship.getUtilization());
    spaceship.setUtilization(0);
    planetRepository.save(planet);
    spaceshipRepository.save(spaceship);
  }
}
