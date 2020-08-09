package com.example.task.service;

import com.example.task.domain.DataBaseValue;
import com.example.task.domain.DataBaseValueRepository;
import com.example.task.domain.dto.DataBaseValueDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
class DatabaseService implements GeneratorService {

  private final DataBaseValueRepository dataBaseValueRepository;

  @Override
  public DataBaseValueDto next() {
    return dataBaseValueRepository.findById(1L)
        .map(DataBaseValue::getQuality)
        .map(DataBaseValueDto::of)
        .orElseGet(DataBaseValueDto::zero);
  }
}
