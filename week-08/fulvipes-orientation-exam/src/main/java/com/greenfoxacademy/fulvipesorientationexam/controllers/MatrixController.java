package com.greenfoxacademy.fulvipesorientationexam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatrixController {


  @GetMapping("/")
  public String showPage(Model model) {
    return "index";
  }

  @PostMapping("/matrix")
  public String getMatrix() {
    return "redirect:/";
  }

  @GetMapping("/matrices")
  public String getMatrices() {
    return "add later";
  }

}
