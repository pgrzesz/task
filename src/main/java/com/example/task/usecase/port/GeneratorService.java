package com.example.task.usecase.port;

import com.example.task.domain.dto.TaskValue;

public interface GeneratorService {

    TaskValue next();
}
