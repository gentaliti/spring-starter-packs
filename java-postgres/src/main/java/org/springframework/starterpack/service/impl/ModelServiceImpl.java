package org.springframework.starterpack.service.impl;

import org.springframework.starterpack.entity.Model;
import org.springframework.starterpack.repository.ModelRepository;
import org.springframework.starterpack.service.ModelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelServiceImpl implements ModelService {
    private ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public Optional<Model> getModelById(Integer id) {
        return modelRepository.findById(id);
    }

    @Override
    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }

    @Override
    public Integer deleteModel(Integer id) {
        modelRepository.deleteById(id);
        return id;
    }

    @Override
    public Model updateModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Model insertModel(Model model) {
        return modelRepository.save(model);
    }
}
