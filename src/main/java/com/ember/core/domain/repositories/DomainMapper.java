package com.ember.core.domain.repositories;

public interface DomainMapper<TDomain, TEntity> {

  TDomain toDomain(TEntity entityUpdated);

  TEntity toRepository(TDomain domain);
}