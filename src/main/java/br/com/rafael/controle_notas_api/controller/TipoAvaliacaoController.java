package br.com.rafael.controle_notas_api.controller;

import br.com.rafael.controle_notas_api.dto.TipoAvaliacaoDTO;
import br.com.rafael.controle_notas_api.service.TipoAvaliacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/tipos-avaliacao")
public class TipoAvaliacaoController {

    private final TipoAvaliacaoService service;

    public TipoAvaliacaoController(TipoAvaliacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TipoAvaliacaoDTO>>listar() {
        return ResponseEntity.ok(service.listar());
    }
}