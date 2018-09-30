package com.greenfoxacademy.fulvipesorientationexam.controllers;

import com.greenfoxacademy.fulvipesorientationexam.models.Matrix;
import com.greenfoxacademy.fulvipesorientationexam.services.MatrixServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatrixController {
  @Autowired
  MatrixServiceImpl matrixService;
  Matrix matrix = new Matrix("");

  @GetMapping("/")
  public String showPage(Model model) {
    model.addAttribute("matrix", matrix);
    model.addAttribute("isSquare", matrixService.isSquare(matrix));
    model.addAttribute("isIncreasing", matrixService.isIncreasing(matrix));
    return "index";
  }

  @PostMapping("/matrix")
  public String getMatrix(Model model, @ModelAttribute (value="matrixNumbers") String matrixNumbers) {
    matrix.setMatrixNumbers(matrixNumbers);
    matrixService.saveMatrix(matrix);
    return "redirect:/";
  }

  @GetMapping("/matrices")
  public String getMatrices() {
    return "add later";
  }

}
