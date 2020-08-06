package com.example.task.adapter;

import com.example.task.domain.dto.TaskValue;
import com.example.task.domain.entity.Task;
import com.example.task.usecase.port.GeneratorService;
import com.example.task.usecase.port.TaskRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;


@RequiredArgsConstructor
public class DatabaseService implements GeneratorService {

    private final TaskRepository taskRepository;

    @Override
    public TaskValue next() {
        Optional<Task> optionalTask = taskRepository.findById(1L);
        if (!optionalTask.isPresent()) {
            return TaskValue.builder().value(0).build();
        }
        return TaskValue.builder().value(optionalTask.get().getQuality()).build();
    }
}
