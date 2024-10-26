package com.ember.core.application.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorResponseDto {
  private int status;
  private String error;
  private String message;
  private String path;
}
