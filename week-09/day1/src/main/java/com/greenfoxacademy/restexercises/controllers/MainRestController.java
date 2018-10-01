package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.*;
import com.greenfoxacademy.restexercises.repositories.LogRepository;
import com.greenfoxacademy.restexercises.services.ArrayHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainRestController {
  @Autowired
  ArrayHandlerService arrayHandlerService;
  @Autowired
  LogRepository logRepository;

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) String input) {
    logRepository.save(new Log("/doubling", input));
    if (input == null) {
      ErrorMessage inputErrorMessage = new ErrorMessage("Please provide an input!");
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(inputErrorMessage);
    } else {
      Doubling doubling = new Doubling(Integer.parseInt(input));
      return ResponseEntity.status(HttpStatus.CREATED).body(doubling);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    logRepository.save(new Log("/greeter", name + ", " + title));
    if (name == null) {
      ErrorMessage nameErrorMessage = new ErrorMessage("Please provide a name!");
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(nameErrorMessage);
    } else if (title == null) {
      ErrorMessage titleErrorMessage = new ErrorMessage("Please provide a title!");
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(titleErrorMessage);
    } else {
      Greeter greeter = new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
      return ResponseEntity.status(HttpStatus.CREATED).body(greeter);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<AppendA> appenda(@PathVariable(value = "appendable") String appendable) {
    logRepository.save(new Log("/greeter", appendable));
    AppendA appendA = new AppendA(appendable);
    return ResponseEntity.status(HttpStatus.CREATED).body(appendA);
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> dountil(@PathVariable(value = "action") String action, @RequestBody Dountil dountil) {
    logRepository.save(new Log("/greeter", dountil.toString()));

    if (dountil == null) {
      ErrorMessage objectErrorMessage = new ErrorMessage("Please provide a number!");
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(objectErrorMessage);
    } else if (action.equals("sum")) {
      dountil.sum();
    } else if (action.equals("factor")) {
      dountil.factor();
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(dountil);
  }

  @PostMapping("/arrays")
  public ResponseEntity<?> arrays(@RequestBody ArrayHandler arrayHandler) {
    logRepository.save(new Log("/greeter", arrayHandler.toString()));
    if (arrayHandler.getWhat() == null) {
      ErrorMessage objectErrorMessage = new ErrorMessage("Please provide what to do with the numbers!");
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(objectErrorMessage);
    } else if (arrayHandler.getWhat().equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerService.sum(arrayHandler));
    } else if (arrayHandler.getWhat().equals("multiply")) {
      return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerService.multiply(arrayHandler));
    } else
      return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerService.doubling(arrayHandler));
  }

  @GetMapping("/logs")
  public List<Log> getLogs() {
    return logRepository.findAll();
  }


}