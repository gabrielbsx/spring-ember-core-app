package com.ember.core.domain.contracts;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;

import com.ember.core.application.dtos.ErrorResponseDto;

import jakarta.servlet.http.HttpServletRequest;

public interface CustomErrorController extends ErrorController {
  ResponseEntity<ErrorResponseDto> handleError(HttpServletRequest request);
}
