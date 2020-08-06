package com.example.task.endpoints;

import com.example.task.TaskValueFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/task")
@RequiredArgsConstructor
class TaskController {

    private final TaskValueFacade taskValueFacade;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public void connectValue() {
        taskValueFacade.connectValue();
    }
}

