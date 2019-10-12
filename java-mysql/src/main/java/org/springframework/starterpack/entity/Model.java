package org.springframework.starterpack.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model entity
 *
 * @author Gent Aliti
 */
@Data
@Entity
public class Model {
    @Id
    @GeneratedValue
    private Integer id;
    private String handle;
}
