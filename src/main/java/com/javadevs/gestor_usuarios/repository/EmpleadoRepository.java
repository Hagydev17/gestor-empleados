package com.javadevs.gestor_usuarios.repository;

import com.javadevs.gestor_usuarios.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
    Optional<Empleado> findById(Long id);
}
