package com.example.task.domain.dto;

import lombok.Value;

@Value(staticConstructor = "of")
public class DataBaseValueDto {

  private static final DataBaseValueDto ZERO_VALUE = of(0);
  int value;

  public static DataBaseValueDto zero() {
    return ZERO_VALUE;
  }
}
