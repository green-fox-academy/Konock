package com.greenfoxacademy.gfaclassapp.controllers;

import com.greenfoxacademy.gfaclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
  StudentService studentService;

  @Autowired
  public void implementStudentService(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String mainPage() {
    return "index";
  }

  @GetMapping("/gfa/list")
  public String listAllStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list";
  }

}
