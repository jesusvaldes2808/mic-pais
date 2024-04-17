package com.cursos.micpais.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaisEntity {

    private String nombre;
    private String capital;
    private int poblacion;
    private String bandera;
}
