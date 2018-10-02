package com.greenfoxacademy.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> grootTranslator(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      ErrorMessage errorMessage = new ErrorMessage("I am Groot!");
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    } else {
      GrootTranslator grootTranslator = new GrootTranslator(message);
      return ResponseEntity.status(HttpStatus.OK).body(grootTranslator);
    }
  }
}
