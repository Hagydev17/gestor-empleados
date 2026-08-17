package com.javadevs.gestor_usuarios.controller;

import com.javadevs.gestor_usuarios.entity.Cargo;
import com.javadevs.gestor_usuarios.service.CargoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    private final CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping
    public List<Cargo> findAll() {
        return cargoService.findAll();
    }

    @GetMapping("/{id}")
    public Cargo findById(@PathVariable Long id) {
        return cargoService.findById(id);
    }

    @PostMapping
    public Cargo save(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }

    @PutMapping("/{id}")
    public Cargo update(@PathVariable Long id, @RequestBody Cargo cargo) {
        return cargoService.update(id, cargo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cargoService.delete(id);
    }
}
