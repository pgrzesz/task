package com.example.task.processor;

import com.example.task.service.GeneratorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("addition")
class SumValueService implements Processor {

  @Override
  public String process(List<GeneratorService> generatorServiceList) {
    final int result = generatorServiceList.stream()
        .mapToInt(value -> value.next().getValue())
        .sum();
    return String.valueOf(result);
  }
}
