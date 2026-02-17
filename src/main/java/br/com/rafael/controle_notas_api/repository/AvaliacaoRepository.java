package br.com.rafael.controle_notas_api.repository;

import br.com.rafael.controle_notas_api.dto.NotaFinalDTO;
import br.com.rafael.controle_notas_api.model.Avaliacao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
    

    @Query("""
        SELECT a FROM Avaliacao a
           JOIN FETCH a.materia
           JOIN FETCH a.tipo
           WHERE a.aluno.id = :alunoId
           AND a.trimestre = :trimestre
           """)
    List<Avaliacao>buscarPorAlunoETrimestre(@Param("alunoId") Long alunoId, @Param("trimestre") Integer trimestre);
    
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
           AND (:trimestre IS NULL OR a.trimestre = :trimestre)
        GROUP BY m.id, m.materia
        ORDER BY m.materia
    """)
    List<NotaFinalDTO> buscarNotasFinais(@Param("alunoId")Long alunoId, @Param("trimestre") Integer trimestre);
    
   
}

