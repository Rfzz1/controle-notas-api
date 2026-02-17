    
package br.com.rafael.controle_notas_api.controller;

import br.com.rafael.controle_notas_api.dto.AvaliacaoCreateDTO;
import br.com.rafael.controle_notas_api.dto.AvaliacaoDTO;
import br.com.rafael.controle_notas_api.dto.AvaliacaoResponseDTO;
import br.com.rafael.controle_notas_api.dto.NotaFinalDTO;
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

@GetMapping("/boletim-final/{alunoId}")
public List<NotaFinalDTO> boletimFinal(@PathVariable Long alunoId, Integer trimestre) {
    return service.boletimFinal(alunoId, trimestre);
} 

@DeleteMapping("/{id}")
public ResponseEntity<Void> deletar(@PathVariable Long id) {
    service.deletar(id);
    return ResponseEntity.noContent().build();
}


@PutMapping("/{id}")
public ResponseEntity<?> atualizar(
        @PathVariable Long id,
        @RequestBody AvaliacaoCreateDTO dto) {

    AvaliacaoDTO atualizado = service.atualizar(id, dto);
    return ResponseEntity.ok(atualizado);
}

@GetMapping("/aluno/{alunoId}/trimestre/{trimestre}")
public ResponseEntity<List<AvaliacaoResponseDTO>>listarPorAlunoETrimestre(
    @PathVariable Long alunoId,
    @PathVariable Integer trimestre) {
    
    return ResponseEntity.ok(
            service.listarPorAlunoETrimestre(alunoId, trimestre)
    );
}

}

