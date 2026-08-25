package com.javadevs.gestor_usuarios.service;

import com.javadevs.gestor_usuarios.entity.Empleado;
import com.javadevs.gestor_usuarios.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> findById(Long id) {
        return empleadoRepository.findById(id);
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Empleado update(Long id, Empleado empleado) {
        Empleado actual = empleadoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado."));
        actual.setNombre(empleado.getNombre());
        actual.setApellido(empleado.getApellido());
        actual.setCurp(empleado.getCurp());
        actual.setRfc(empleado.getRfc());
        //actual.setFechaIngreso(empleado.getFechaIngreso());
        //actual.setFechaNac(empleado.getFechaNac());

        return empleadoRepository.save(actual);
    }

    public void delete(Long id) {
        Empleado empleado = empleadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cargo no encontrado"));
        empleadoRepository.delete(empleado);
    }

}
