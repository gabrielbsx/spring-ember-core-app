package com.ember.core.infra.mongo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Document(collection = "users")
@EqualsAndHashCode(callSuper = true)
public class UserMongoEntity extends AuditMongoEntity {
  private String username;

  private String server;

  private String role;
}
