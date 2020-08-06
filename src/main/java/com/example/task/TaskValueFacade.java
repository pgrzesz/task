package com.example.task;

import com.example.task.usecase.port.GeneratorService;
import com.example.task.usecase.port.Processor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class TaskValueFacade {

    private final GeneratorService databaseService;
    private final GeneratorService generatorRandomService;
    private final Processor processorValue;

    public void connectValue() {
        processorValue.process(generatorRandomService, databaseService);
    }
}
