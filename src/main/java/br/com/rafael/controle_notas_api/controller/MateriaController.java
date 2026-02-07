package br.com.rafael.controle_notas_api.controller;

import br.com.rafael.controle_notas_api.dto.MateriaDTO;
import br.com.rafael.controle_notas_api.service.MateriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService service;

    public MateriaController(MateriaService service) {
        this.service = service;
    }

    // LISTAR TODAS AS MATÉRIAS
    @GetMapping
    public List<MateriaDTO> listar() {
        return service.listarMaterias();
    }
}
