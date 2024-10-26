package com.ember.core.application.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ember.core.application.dtos.ErrorResponseDto;
import com.ember.core.domain.contracts.CustomErrorController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/error")
public class CustomErrorControllerImpl implements CustomErrorController {

  @Override
  @GetMapping
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseEntity<ErrorResponseDto> handleError(HttpServletRequest request) {
    var errorDetails = new ErrorResponseDto();

    errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
    errorDetails.setError(HttpStatus.NOT_FOUND.getReasonPhrase());
    errorDetails.setMessage("Resource not found");
    errorDetails.setPath(request.getRequestURI());

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
  }
}
