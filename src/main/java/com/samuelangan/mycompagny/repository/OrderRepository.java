package com.samuelangan.mycompagny.repository;

import com.samuelangan.mycompagny.domain.Event;
import com.samuelangan.mycompagny.domain.Order;
import com.samuelangan.mycompagny.domain.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    Optional<Order> findOneByReference(String reference);
    Optional<Order> findFirstByEvent(Event event);
    Optional<Order> findFirstByUser(User user);
    Optional<Order> findOneByStatus(String status);

    List<Order> findAllByEvent(Event event);
    List<Order> findAllByUser(User user);
    List<Order> findAllByStatus(String status);
}
