package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.Position;
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
public interface PositionRepository extends MongoRepository<Position, String> {
    List<Position> findAllByWarehouse(Warehouse warehouse);

    Optional<Position> findOneByWarehouseAndNameIgnoreCase(Warehouse warehouse, String name);

    List<Position> findAllByWarehouseAndNameContainingIgnoreCase(Warehouse warehouse, String name);
}
