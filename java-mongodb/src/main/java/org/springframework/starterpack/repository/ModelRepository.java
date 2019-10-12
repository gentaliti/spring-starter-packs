package org.springframework.starterpack.repository;

import org.springframework.starterpack.entity.Model;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Model repository
 *
 * @author Gent Aliti
 */
public interface ModelRepository extends MongoRepository<Model, Integer> {
}
