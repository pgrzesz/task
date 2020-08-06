package com.example;

import com.example.task.TaskValueFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log4j2
class MyRunner implements CommandLineRunner {

    private final TaskValueFacade taskValueFacade;

    @Override
    public void run(String... args) throws Exception {
        log.info("Test");
        taskValueFacade.connectValue();
    }
}
