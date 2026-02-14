package br.com.rafael.controle_notas_api.repository;

import br.com.rafael.controle_notas_api.dto.NotaFinalDTO;
import br.com.rafael.controle_notas_api.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    List<Avaliacao> findByAlunoIdAndTrimestre(Long alunoId, Integer Trimestre);
    
    @Query("""
        SELECT new br.com.rafael.controle_notas_api.dto.NotaFinalDTO(
            m.id,
            m.materia,
            COALESCE(SUM(a.nota), 0)
        )
        FROM Materia m
        LEFT JOIN Avaliacao a
            ON a.materia.id = m.id
           AND a.aluno.id = :alunoId
           AND a.trimestre IN (1, 2, 3)
        GROUP BY m.id, m.materia
        ORDER BY m.materia
    """)
    List<NotaFinalDTO> buscarNotasFinais(@Param("alunoId") Long alunoId);
}

