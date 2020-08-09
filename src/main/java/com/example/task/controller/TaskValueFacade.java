package com.example.task.controller;

import com.example.task.display.Display;
import com.example.task.processor.Processor;
import com.example.task.service.GeneratorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class TaskValueFacade {

  private final List<GeneratorService> generatorServiceList;

  private final Processor processorValue;

  private final Display display;

  public TaskValueFacade(List<GeneratorService> generatorServiceList,
      @Qualifier("addition") Processor processorValue,
      @Qualifier("console") Display display) {
    this.generatorServiceList = generatorServiceList;
    this.processorValue = processorValue;
    this.display = display;
  }

  public void get() {
    display.show(processorValue.process(generatorServiceList));
  }
}
