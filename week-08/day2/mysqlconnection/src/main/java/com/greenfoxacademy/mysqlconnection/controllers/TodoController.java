package com.greenfoxacademy.mysqlconnection.controllers;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping("/todo")
  public String showTodo() {
    return "todo";
  }

  @RequestMapping({"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    if (isActive)
      model.addAttribute("todos", todoRepository.findAllByDone(false));
    else
      model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable("id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String edit(Model model, @PathVariable("id") long id) {
    model.addAttribute("todo", todoRepository.findById(id));
    return "edit";
  }

  @PostMapping("/edit/{id}")
  public String edit(@PathVariable("id") long id, @ModelAttribute Todo todo) {
    todo.setId(id);
    todoRepository.save(todo);
    return "redirect:/";
  }
}
