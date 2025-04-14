package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.ApplicationLog;
import com.samuelangan.mycompagny.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface ApplicationLogRepository extends MongoRepository<ApplicationLog, String> {}
