package com.greenfoxacademy.foxygochi.controllers;

import com.greenfoxacademy.foxygochi.models.Fox;
import com.greenfoxacademy.foxygochi.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  FoxService foxService;

  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @RequestMapping("/")
  public String showIndex(Model model, @RequestParam(value="name") String name) {
    model.addAttribute("fox", foxService.foxes.getFoxByName(name));
    return "index";
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String loginPage(@RequestParam(value="name") String name) {
    if (name.length() < 1)
      return "redirect:/login";
    else if (foxService.foxes.getFoxByName(name) == null)
      return "redirect:/register";
    else
      return "forward:/";
  }

  @GetMapping("/register")
  public String register() {
    return "register";
  }

  @PostMapping("/register")
  public String register(@ModelAttribute Fox fox) {
    foxService.createFox(fox);
    return "redirect:/login";
  }
}

