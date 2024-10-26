package com.ember.core.domain.repositories;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
  T create(T entity);

  T update(T entity);

  void delete(T entity);

  void deleteById(ID id);

  Optional<T> findById(ID id);

  List<T> findAll();
}
