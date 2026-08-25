package com.javadevs.gestor_usuarios.repository;

import com.javadevs.gestor_usuarios.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {}
