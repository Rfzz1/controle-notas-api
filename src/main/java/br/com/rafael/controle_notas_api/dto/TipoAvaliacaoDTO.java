package br.com.rafael.controle_notas_api.dto;

import br.com.rafael.controle_notas_api.model.TipoAvaliacao;

public class TipoAvaliacaoDTO {

    private Long id;
    private String avaliacao;

    public TipoAvaliacaoDTO(TipoAvaliacao tipo) {
        this.id = tipo.getId();
        this.avaliacao = tipo.getAvaliacao();
    }

    public Long getId() {
        return id;
    }

    public String getAvaliacao() {
        return avaliacao;
    }
}