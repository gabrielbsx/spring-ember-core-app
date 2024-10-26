package com.ember.core.application.controllers.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

  @GetMapping
  public String getMethodName() {
    return "Hello";
  }
}
