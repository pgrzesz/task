package com.example.task.usecase.port;

import com.example.task.domain.entity.Task;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface TaskRepository extends Repository<Task, Long> {

    Optional<Task> findById(Long id);
}
