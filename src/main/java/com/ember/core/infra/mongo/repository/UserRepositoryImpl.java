package com.ember.core.infra.mongo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ember.core.domain.entities.User;
import com.ember.core.domain.repositories.UserRepository;
import com.ember.core.infra.mongo.mappers.UserMongoMapper;

@Repository
public class UserRepositoryImpl implements UserRepository {

  private final UserMongoReponsitory userMongoReponsitory;
  private final UserMongoMapper userMapper;

  public UserRepositoryImpl(UserMongoReponsitory userMongoReponsitory, UserMongoMapper userMapper) {
    this.userMongoReponsitory = userMongoReponsitory;
    this.userMapper = userMapper;
  }

  @Override
  public User create(User entity) {
    var userMongo = userMapper.toRepository(entity);
    var savedUserMongo = userMongoReponsitory.save(userMongo);
    return userMapper.toDomain(savedUserMongo);
  }

  @Override
  public User update(User entity) {
    var userMongo = userMapper.toRepository(entity);
    var savedUserMongo = userMongoReponsitory.save(userMongo);
    return userMapper.toDomain(savedUserMongo);
  }

  @Override
  public void delete(User entity) {
    var userMongo = userMapper.toRepository(entity);
    userMongoReponsitory.delete(userMongo);
  }

  @Override
  public void deleteById(String id) {
    userMongoReponsitory.deleteById(id);
  }

  @Override
  public Optional<User> findById(String id) {
    var userMongo = userMongoReponsitory.findById(id);
    return userMongo.map(userMapper::toDomain);
  }

  @Override
  public List<User> findAll() {
    var userMongoList = userMongoReponsitory.findAll();
    var userList = userMongoList.stream().map(userMapper::toDomain).toList();
    return userList;
  }
}
