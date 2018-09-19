package com.greenfoxacademy.simbank.controllers;

import com.greenfoxacademy.simbank.models.AccountsList;
import com.greenfoxacademy.simbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {
  AccountsList accounts = new AccountsList();

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("accounts", accounts.getAccounts());
    model.addAttribute("account", new BankAccount());
    return "show";
  }

  @PostMapping("/accounts/{index}")
  public String addCurrency(@PathVariable(value = "index") int index) {
    accounts.get(index).addCurrency();
    return "redirect:/show";
  }

  @PostMapping("/accounts")
  public String createNewAccount(@ModelAttribute BankAccount account) {
    accounts.add(account);
    return "redirect:/show";
  }

}
