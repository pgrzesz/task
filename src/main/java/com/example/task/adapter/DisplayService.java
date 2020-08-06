package com.example.task.adapter;

import com.example.task.usecase.port.ResultService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DisplayService implements ResultService {
    @Override
    public void process(int value) {
        log.info(value);
    }
}
