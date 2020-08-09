package com.example.task.service;

import com.example.task.domain.dto.DataBaseValueDto;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
class RandomGeneratorService implements GeneratorService {

  @Override
  public DataBaseValueDto next() {
    return DataBaseValueDto.of((new Random().nextInt()));
  }
}
