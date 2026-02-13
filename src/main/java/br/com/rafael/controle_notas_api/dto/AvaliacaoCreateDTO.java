package br.com.rafael.controle_notas_api.dto;

import java.time.LocalDate;

public class AvaliacaoCreateDTO {

    private Long alunoId;
    private Long materiaId;
    private Long tipoId;
    private Integer trimestre;
    private String titulo;
    private String descricao;
    private Double valorMax;
    private Double nota;
    private LocalDate data;
    
    public AvaliacaoCreateDTO() {
        
    }

    // 🔽 GETTERS

    public Long getAlunoId() {
        return alunoId;
    }

    public Long getMateriaId() {
        return materiaId;
    }

    public Long getTipoId() {
        return tipoId;
    }

    public Integer getTrimestre() {
        return trimestre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValorMax() {
        return valorMax;
    }

    public Double getNota() {
        return nota;
    }

    public LocalDate getData() {
        return data;
    }
}
