package com.javadevs.gestor_usuarios.controller;


import com.javadevs.gestor_usuarios.entity.Empleado;
import com.javadevs.gestor_usuarios.service.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    private final EmpleadoService empleadoService;
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping()
    public List<Empleado> findAll() {

        return empleadoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> findById(@PathVariable Long id) {
        return empleadoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Empleado save(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @PutMapping
    public Empleado update(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        empleadoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
