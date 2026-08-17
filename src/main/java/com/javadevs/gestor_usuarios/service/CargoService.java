package com.javadevs.gestor_usuarios.service;

import com.javadevs.gestor_usuarios.entity.Cargo;
import com.javadevs.gestor_usuarios.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {
    private final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Cargo findById(Long id) {
        return cargoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cargo o puesto no encontrado"));
    }

    public Cargo save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public Cargo update(Long id, Cargo updatedCargo) {
        Cargo existingCargo = cargoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cargo no encontrado"));
        existingCargo.setPositionTitle(updatedCargo.getPositionTitle());
        existingCargo.setPositionDescription(updatedCargo.getPositionDescription());
        existingCargo.setBaseSalary(updatedCargo.getBaseSalary());

        return cargoRepository.save(existingCargo);
    }

    public void delete(Long id) {
        Cargo cargo = cargoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cargo no encontrado"));
        cargoRepository.delete(cargo);
    }
}
