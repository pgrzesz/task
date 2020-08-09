package com.example.task.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/task")
@RequiredArgsConstructor
class TaskController {

  private final TaskValueFacade taskValueFacade;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public void connectValue() {
    taskValueFacade.get();
  }
}

