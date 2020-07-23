package com.funny.noter.repository;

import com.funny.noter.entity.NoterEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoterRepository extends MongoRepository<NoterEntity, String> {

}
