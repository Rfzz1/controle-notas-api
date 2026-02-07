package br.com.rafael.controle_notas_api.controller;

import br.com.rafael.controle_notas_api.dto.AlunoDTO;
import br.com.rafael.controle_notas_api.dto.LoginResponseDTO;
import br.com.rafael.controle_notas_api.dto.RegistroAlunoDTO;
import br.com.rafael.controle_notas_api.model.Aluno;
import br.com.rafael.controle_notas_api.model.Materia;
import br.com.rafael.controle_notas_api.repository.MateriaRepository;
import br.com.rafael.controle_notas_api.service.AlunoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }
    

    // LISTAR
    @GetMapping
    public List<AlunoDTO> listar() {
        return service.listar();
    }

    // REGISTRAR
    @PostMapping("/registrar")
    public ResponseEntity<?> registrar(@RequestBody RegistroAlunoDTO dto) {
        
        if (dto.getAluno() == null || dto.getSenha() == null) {
            return
            ResponseEntity.badRequest().body("Dados Inválidos");
        }

        Aluno novo = service.registrar(dto.getAluno(), dto.getSenha());
        return ResponseEntity.ok(novo);
    }

    // LOGIN
@PostMapping("/login")
public ResponseEntity<LoginResponseDTO> login(@RequestBody Map<String, String> body) {

    String aluno = body.get("aluno");
    String senha = body.get("senha");

    if (aluno == null || senha == null) {
        return ResponseEntity.badRequest().build();
    }

    return ResponseEntity.ok(service.login(aluno, senha));
}
    
    @GetMapping("/{id}")
public ResponseEntity<AlunoDTO> buscarPorId(@PathVariable Long id) {
    return ResponseEntity.ok(service.buscarPorId(id));
}
   
}
