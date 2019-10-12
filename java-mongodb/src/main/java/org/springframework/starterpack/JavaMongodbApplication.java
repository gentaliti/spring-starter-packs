package org.springframework.starterpack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Java spring mongodb app
 *
 * @author Gent Aliti
 */
@SpringBootApplication
@EnableMongoRepositories
public class JavaMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMongodbApplication.class, args);
    }

}
