package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.BoxCatalog;
import com.samuelangan.mycompagny.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface BoxCatalogRepository extends MongoRepository<BoxCatalog, String> {}
