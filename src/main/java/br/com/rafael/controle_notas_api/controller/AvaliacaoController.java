    
package br.com.rafael.controle_notas_api.controller;

import br.com.rafael.controle_notas_api.dto.AvaliacaoCreateDTO;
import br.com.rafael.controle_notas_api.dto.AvaliacaoDTO;
import br.com.rafael.controle_notas_api.model.Avaliacao;
import br.com.rafael.controle_notas_api.service.AvaliacaoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    private final AvaliacaoService service;

    public AvaliacaoController(AvaliacaoService service) {
        this.service = service;
    }

@PostMapping
public ResponseEntity<AvaliacaoDTO> criar(@RequestBody AvaliacaoCreateDTO dto) {

    AvaliacaoDTO avaliacao = service.criar(dto);

    return ResponseEntity
            .status(201)
            .body(avaliacao);
}


@GetMapping("/aluno/{alunoId}")
public ResponseEntity<List<AvaliacaoDTO>> listarPorAluno(@PathVariable Long alunoId ,@RequestParam int trimestre) {
    return ResponseEntity.ok(service.listarPorAlunoETrimestre(alunoId, trimestre));
}
}

