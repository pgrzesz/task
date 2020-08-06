package com.example.task;


import com.example.task.adapter.DatabaseService;
import com.example.task.adapter.DisplayService;
import com.example.task.adapter.RandomGeneratorService;
import com.example.task.usecase.SumValueService;
import com.example.task.usecase.port.GeneratorService;
import com.example.task.usecase.port.Processor;
import com.example.task.usecase.port.ResultService;
import com.example.task.usecase.port.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class TaskValueConfiguration {

    @Bean
    TaskValueFacade taskValueFacade(TaskRepository taskRepository) {
        GeneratorService databaseService = new DatabaseService(taskRepository);
        GeneratorService generatorRandomService = new RandomGeneratorService();
        ResultService resultService = new DisplayService();
        Processor processor = new SumValueService(resultService);
        return new TaskValueFacade(databaseService, generatorRandomService, processor);
    }
}
