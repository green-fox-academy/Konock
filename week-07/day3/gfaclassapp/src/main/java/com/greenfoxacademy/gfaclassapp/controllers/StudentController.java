package com.greenfoxacademy.gfaclassapp.controllers;

import com.greenfoxacademy.gfaclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
  StudentService studentService;

  @Autowired
  public void implementStudentService(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("")
  public String mainPage(Model model) {
    model.addAttribute("studentCount", studentService.count());
    return "index";
  }

  @GetMapping("/list")
  public String listAllStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list";
  }

  @GetMapping("/add")
  public String addStudent() {
    return "add";
  }

  @PostMapping("/save")
  public String addStudent(@ModelAttribute(value = "student-name") String name) {
    studentService.save(name);
    return "redirect:/list";
  }

  @GetMapping("/check")
  public String checkPage() {
    return "check";
  }

  @GetMapping("/checkstudent")
  public String checkStudent(Model model, @RequestParam("student-name") String name) {
    model.addAttribute("ifPresent", studentService.checkIfPresent(name));
    return "checkstudent";
  }

}
