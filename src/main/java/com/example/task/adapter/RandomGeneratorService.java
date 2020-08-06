package com.example.task.adapter;

import com.example.task.domain.dto.TaskValue;
import com.example.task.usecase.port.GeneratorService;

import java.util.Random;

public class RandomGeneratorService implements GeneratorService {

    @Override
    public TaskValue next() {
        return TaskValue.builder().value(new Random().nextInt()).build();
    }
}
