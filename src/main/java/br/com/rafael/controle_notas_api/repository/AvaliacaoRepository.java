package br.com.rafael.controle_notas_api.repository;

import br.com.rafael.controle_notas_api.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    List<Avaliacao> findByAlunoId(Long alunoId);
}
