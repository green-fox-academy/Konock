package com.greenfoxacademy.dipractice.controllers;

import com.greenfoxacademy.dipractice.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  UtilityService utilityService;

  @GetMapping("/useful")
  public String mainPage() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String colorPage(Model model, UtilityService utilityService) {
    this.utilityService = utilityService;
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful/email")
  public String emailValidator(UtilityService utilityService, @RequestParam("email") String email) {
    this.utilityService = utilityService;

    return "email";
  }
}
