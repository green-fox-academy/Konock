package com.greenfoxacademy.restexercises.services;

import com.greenfoxacademy.restexercises.models.ArrayHandler;
import com.greenfoxacademy.restexercises.models.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayHandlerService {
  ArrayHandler arrayHandler = new ArrayHandler();

  public ArrayHandlerService() {
  }

  public Result sum(ArrayHandler arrayHandler) {
    int result = 0;
    for (int i = 0; i < arrayHandler.getNumbers().size(); i++) {
      result += arrayHandler.getNumbers().get(i);
    }
    return new Result(result);
  }

  public Result multiply(ArrayHandler arrayHandler) {
    int result = 1;
    for (int i = 0; i < arrayHandler.getNumbers().size(); i++) {
      result *= arrayHandler.getNumbers().get(i);
    }
    return new Result(result);
  }

  public Result doubling(ArrayHandler arrayHandler) {
    List<Integer> doubledList = new ArrayList<>();
    for (int number : arrayHandler.getNumbers()) {
      doubledList.add(number * 2);
    }
    return new Result(doubledList);
  }
}
