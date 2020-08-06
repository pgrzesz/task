package com.example.task.usecase;

import com.example.task.domain.dto.TaskValue;
import com.example.task.usecase.port.GeneratorService;
import com.example.task.usecase.port.Processor;
import com.example.task.usecase.port.ResultService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SumValueService implements Processor {

    private final ResultService resultService;

    @Override
    public void process(GeneratorService firstGenerator, GeneratorService secondGenerator) {
        TaskValue firstValue = firstGenerator.next();
        TaskValue secondValue = secondGenerator.next();
        int result = firstValue.getValue() + secondValue.getValue();
        resultService.process(result);
    }
}
