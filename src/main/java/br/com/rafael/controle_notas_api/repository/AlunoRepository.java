package br.com.rafael.controle_notas_api.repository;

import br.com.rafael.controle_notas_api.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByAluno(String aluno);
    
    boolean existsByAluno(String aluno);
}
