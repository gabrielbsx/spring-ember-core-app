package com.ember.core.infra.mongo.mappers;

import org.mapstruct.Mapper;

import com.ember.core.domain.entities.User;
import com.ember.core.infra.mongo.models.UserMongoEntity;

@Mapper(componentModel = "spring")
public interface UserMongoMapper {
  UserMongoMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(UserMongoMapper.class);

  User toDomain(UserMongoEntity userMongo);

  UserMongoEntity toRepository(User user);
}
