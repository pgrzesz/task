package com.example.task.display;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("console")
@Log4j2
class ConsoleDisplay implements Display {

  @Override
  public void show(String result) {
    log.info(String.format("The result of the action is: %s", result));
  }
}
