package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.*;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface CatalogRepository extends MongoRepository<Catalog, String> {
    List<Catalog> findByBookContainingIgnoreCase(String name);

    Optional<Catalog> findOneByBookIgnoreCase(String name);

    List<Catalog> findAllByLanguage(Language language);
}
