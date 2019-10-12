package org.springframework.starterpack.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model entity
 *
 * @author Gent Aliti
 */
@Data
@Document(collection = "model")
public class Model {
    @Id
    private Integer id;
    private String handle;
}
