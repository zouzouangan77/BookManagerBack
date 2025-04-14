package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.User;
import com.samuelangan.mycompagny.domain.Warehouse;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface WarehouseRepository extends MongoRepository<Warehouse, String> {
    List<Warehouse> findByNameContainingIgnoreCase(String name);

    Optional<Warehouse> findOneByNameIgnoreCase(String name);
}
