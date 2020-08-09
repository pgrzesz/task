package com.example.task.processor;

import com.example.task.service.GeneratorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("multiplication")
class MultiplicationValueService implements Processor {

  @Override
  public String process(List<GeneratorService> generatorServiceList) {
    final int result = generatorServiceList.stream().mapToInt(value -> value.next().getValue())
        .reduce(0, (a, b) -> a * b);
    return String.valueOf(result);
  }
}
