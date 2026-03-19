package com.rj.key_service.infraestructure.persistence.repository;

import com.rj.key_service.domain.model.keys_Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeysRedisRepository extends CrudRepository<keys_Entity, Integer> {

}