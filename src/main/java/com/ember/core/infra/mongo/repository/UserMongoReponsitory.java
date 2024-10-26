package com.ember.core.infra.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ember.core.infra.mongo.models.UserMongoEntity;

@Repository
public interface UserMongoReponsitory extends MongoRepository<UserMongoEntity, String> {

}
