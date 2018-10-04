package com.greenfoxacademy.corsacorientationexam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String showPage() {
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveShip() {
    return "redirect:/";
  }

  @GetMapping("/toship")
  public String toShip() {
    return "redirect:/";
  }

  @GetMapping("/toplanet")
  public String toPlanet() {
    return "redirect:/";
  }


}
