package com.greenfoxacademy.simbank.controllers;

import com.greenfoxacademy.simbank.models.AccountsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {
  AccountsList accounts = new AccountsList();

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("accounts", accounts.getAccounts());
    return "show";
  }

  @PostMapping("/accounts/{index}")
  public String addCurrency(@PathVariable(value = "index") int index) {
    accounts.get(index).addCurrency();
    return "redirect:/show";
  }

}
