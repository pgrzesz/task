package com.example.task.processor;

import com.example.task.service.GeneratorService;
import java.util.List;

public interface Processor {

  String process(List<GeneratorService> generatorServiceList);
}
