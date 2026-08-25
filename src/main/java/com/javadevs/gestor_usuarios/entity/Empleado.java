package com.javadevs.gestor_usuarios.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Temporal;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre del empleado es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido del empleado es obligatorio")
    private String apellido;
    @NotBlank(message = "El CURP del empleado es obligatorio")
    private String curp;
    @NotBlank(message = "El RFC del empleado es obligatorio")
    private String rfc;
    @NotBlank(message = "El telefono del empleado es obligatorio")
    private String telefono;

    //private Date fechaNac;
    //private Date fechaIngreso;

}
