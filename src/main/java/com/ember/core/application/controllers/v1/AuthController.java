package com.ember.core.application.controllers.v1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ember.core.domain.entities.User;
import com.ember.core.domain.repositories.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {
  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public ArrayList<User> getMethodName(@RequestParam String param) {
    var users = this.userRepository.findAll();

    return new ArrayList<>(users);
  }
}
