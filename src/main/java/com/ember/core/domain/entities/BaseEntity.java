package com.ember.core.domain.entities;

import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseEntity {
  protected String id;
  protected Date createdAt;
  protected Date updatedAt;
}
