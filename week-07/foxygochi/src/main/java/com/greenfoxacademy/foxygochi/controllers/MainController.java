package com.greenfoxacademy.foxygochi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String showIndex() {
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
    else
      return "redirect:/{name}";
  }
}
