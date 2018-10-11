package com.greenfoxacademy.securitypractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainPage() {
    return "index";
  }

  @GetMapping("/admin")
  public String adminPage() {
    return "This is the admin page";
  }
}
