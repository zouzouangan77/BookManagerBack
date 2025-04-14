package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.Language;
import com.samuelangan.mycompagny.domain.User;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface LanguageRepository extends MongoRepository<Language, String> {
    List<Language> findByNameContainingIgnoreCase(String name);
}
