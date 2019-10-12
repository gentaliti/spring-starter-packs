package org.springframework.starterpack.repository;

import org.springframework.starterpack.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Model repository
 *
 * @author Gent Aliti
 */
@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
}
