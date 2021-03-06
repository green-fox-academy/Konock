package com.greenfoxacademy.corsacorientationexam.controllers;

import com.greenfoxacademy.corsacorientationexam.services.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  @Autowired
  SpaceshipService spaceshipService;


  @GetMapping("/")
  public String showPage(Model model) {
    model.addAttribute("planets", spaceshipService.getPlanets());
    model.addAttribute("spaceship", spaceshipService.getSpaceship());
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveShip(@PathVariable(value = "id") long id) {
    spaceshipService.moveSpaceship(id);
    return "redirect:/";
  }

  @GetMapping("/toship/{id}")
  public String toShip(@PathVariable(value = "id") long id) {
    spaceshipService.moveToShip(id);
    return "redirect:/";
  }

  @GetMapping("/toplanet/{id}")
  public String toPlanet(@PathVariable(value = "id") long id) {
    spaceshipService.moveToPlanet(id);
    return "redirect:/";
  }


}
