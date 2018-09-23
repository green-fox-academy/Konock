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

  @GetMapping("/nutritionStore/")
  public String showNutritionStore(Model model, @RequestParam(value="name") String name) {
    model.addAttribute("fox", foxService.foxes.getFoxByName(name));
    model.addAttribute("foodOptions", foxService.getFoodOptions());
    model.addAttribute("drinkOptions", foxService.getDrinkOptions());
    return "nutrition";
  }

  @PostMapping("/nutritionStore/")
  public String setNutrition(@RequestParam("name") String name, @RequestParam("food") String food, @RequestParam("drink") String drink) {
    foxService.foxes.getFoxByName(name).setFood(food);
    foxService.foxes.getFoxByName(name).setDrink(drink);
    return "forward:/";
  }

  @GetMapping("/trickcenter/")
  public String showTrickCenter(Model model, @RequestParam(value="name") String name) {
    model.addAttribute("fox", foxService.foxes.getFoxByName(name));
    model.addAttribute("trickOptions", foxService.getTrickOptions());
    return "trickcenter";
  }

  @PostMapping("/trickcenter/")
  public String learnTricks(@RequestParam("name") String name, @RequestParam("trick") String trick) {
    foxService.foxes.getFoxByName(name).addTrick(trick);
    return "forward:/";
  }
}

