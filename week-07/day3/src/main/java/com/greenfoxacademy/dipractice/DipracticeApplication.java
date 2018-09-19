package com.greenfoxacademy.dipractice;

import com.greenfoxacademy.dipractice.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DipracticeApplication {
  Printer printer;
  MyColor myColor;

  @Autowired
  public void implementPrinter(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
    printer.log(myColor.printColor());
  }

  public static void main(String[] args) {
    SpringApplication.run(DipracticeApplication.class, args);
  }
}
