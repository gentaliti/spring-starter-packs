package org.springframework.starterpack.controller;

import org.springframework.starterpack.entity.Model;
import org.springframework.starterpack.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

/**
 * Model controller
 *
 * @author Gent Aliti
 */
@RestController
@RequestMapping("/model")
public class ModelController {
    private ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping("/{id}")
    public ResponseEntity getModelById(@PathVariable int id) {
        return ResponseEntity.ok(modelService.getModelById(id).orElseThrow(() -> new RuntimeException("Model does not exists.")));
    }

    @GetMapping("/all")
    public ResponseEntity getModels() {
        return ResponseEntity.ok(modelService.getAllModels());
    }

    @PostMapping
    public ResponseEntity createModel(@RequestBody Model model) {
        return ResponseEntity.created(URI.create("")).body(modelService.insertModel(model));
    }

    @PutMapping
    public ResponseEntity updateModel(@RequestBody Model model) {
        return ResponseEntity.created(URI.create("")).body(modelService.updateModel(model));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteModel(@PathVariable int id) {
        return ResponseEntity.ok(modelService.deleteModel(id));
    }
}
