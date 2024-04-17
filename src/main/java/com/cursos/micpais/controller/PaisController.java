package com.cursos.micpais.controller;

import com.cursos.micpais.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping
@RestController
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/api/pais")
    public String getAll() {
        return paisService.getPais();
    }
}
