package br.com.rafael.controle_notas_api.service;

import br.com.rafael.controle_notas_api.model.Aluno;
import br.com.rafael.controle_notas_api.repository.AlunoRepository;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import br.com.rafael.controle_notas_api.dto.AlunoDTO;
import br.com.rafael.controle_notas_api.dto.LoginResponseDTO;
import java.util.List;
import java.util.stream.Collectors;



@Service
public class AlunoService {

    private final AlunoRepository repository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }
    
    public AlunoDTO buscarPorId(Long id) {
    Aluno aluno = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

    return new AlunoDTO(aluno.getId(), aluno.getAluno());
}
    
    public List<AlunoDTO> listar() {
    return repository.findAll()
            .stream()
            .map(a -> new AlunoDTO(a.getId(), a.getAluno()))
            .collect(Collectors.toList());
}

    public Aluno registrar(String aluno, String senha) {

        if (repository.existsByAluno(aluno)) {
            throw new IllegalStateException("Aluno já existe");
        }

        Aluno novo = new Aluno();
        novo.setAluno(aluno);
        novo.setSenha(encoder.encode(senha));

        return repository.save(novo);
    }

public LoginResponseDTO login(String aluno, String senha) {

    Aluno a = repository.findByAluno(aluno)
            .orElseThrow(() -> new RuntimeException("Aluno ou senha inválidos"));

    if (!encoder.matches(senha, a.getSenha())) {
        throw new RuntimeException("Aluno ou senha inválidos");
    }

    return new LoginResponseDTO(a.getId(), a.getAluno());
}
}

