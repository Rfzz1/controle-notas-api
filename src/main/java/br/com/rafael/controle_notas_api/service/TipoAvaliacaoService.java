package br.com.rafael.controle_notas_api.service;

import br.com.rafael.controle_notas_api.dto.TipoAvaliacaoDTO;
import br.com.rafael.controle_notas_api.repository.TipoAvaliacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAvaliacaoService {

    private final TipoAvaliacaoRepository repository;

    public TipoAvaliacaoService(TipoAvaliacaoRepository repository) {
        this.repository = repository;
    }

    public List<TipoAvaliacaoDTO> listar() {
        return repository.findAll()
                .stream()
                .map(TipoAvaliacaoDTO::new)
                .toList();
    }
}