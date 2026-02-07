package br.com.rafael.controle_notas_api.repository;

import br.com.rafael.controle_notas_api.model.TipoAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAvaliacaoRepository
        extends JpaRepository<TipoAvaliacao, Long> {
}