package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Attribute;
import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    Greeting greeting = new Greeting(name);
    Attribute attribute = new Attribute();
    model.addAttribute("fontColor", attribute.getFontColor());
    model.addAttribute("fontSize", attribute.getFontSize());
    model.addAttribute("hello", attribute.getHello());
    model.addAttribute("name", greeting.getName());
    model.addAttribute("loadID", greeting.getId());
    return "greeting";
  }
}
