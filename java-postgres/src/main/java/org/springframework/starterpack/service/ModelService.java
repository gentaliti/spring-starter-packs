package org.springframework.starterpack.service;

import org.springframework.starterpack.entity.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {
    Optional<Model> getModelById(Integer id);

    List<Model> getAllModels();

    Integer deleteModel(Integer id);

    Model updateModel(Model model);

    Model insertModel(Model model);
}
