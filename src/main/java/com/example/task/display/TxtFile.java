package com.example.task.display;

import java.io.FileWriter;
import java.io.IOException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Qualifier("text")
class TxtFile implements Display {

  @Override
  public void show(String result) {
    createFile(result);
  }

  private void createFile(String fileContent) {
    try (FileWriter myWriter = new FileWriter("displayResultFile.txt")) {
      myWriter.write(String.format("The result of the action is: %s", fileContent));
      log.info("Successfully wrote to the file!");
    } catch (IOException e) {
      log.error("An error occurred.", e);
    }
  }
}
