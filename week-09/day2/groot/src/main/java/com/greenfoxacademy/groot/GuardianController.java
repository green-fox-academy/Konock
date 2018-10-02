package com.greenfoxacademy.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> grootTranslator(@RequestParam(value="message") String somemessage) {
    if (somemessage.equals("somemessage")) {
      GrootTranslator grootTranslator = new GrootTranslator(somemessage);
      return ResponseEntity.ok().body(grootTranslator);
    } else {
      ErrorMessage errorMessage = new ErrorMessage("I am Groot!");
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
  }
}
