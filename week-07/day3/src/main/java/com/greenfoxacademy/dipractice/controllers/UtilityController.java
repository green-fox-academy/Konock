package com.greenfoxacademy.dipractice.controllers;

import com.greenfoxacademy.dipractice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  UtilityService utilityService;

  @Autowired
  public void implementService(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String mainPage() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String colorPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful/email")
  public String emailValidator(Model model, @RequestParam("email") String email) {
    model.addAttribute("validate", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping("useful/caesar")
  public String caesarEncode(Model model, @RequestParam("text") String text, @RequestParam("num") int number) {
    model.addAttribute("encoded", utilityService.caesar(text, number));
    return "caesar";
  }
}
