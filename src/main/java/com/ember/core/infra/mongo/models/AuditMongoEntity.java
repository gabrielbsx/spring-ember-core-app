package com.ember.core.infra.mongo.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
public abstract class AuditMongoEntity {
  @Id
  protected String id;

  @CreatedDate
  protected Date createdAt;

  @LastModifiedDate
  protected Date updatedAt;
}
