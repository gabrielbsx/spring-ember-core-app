package com.ember.core.domain.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
  private String username;
  private String role;
  private String server;
}
