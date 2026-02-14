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

    //GETTERS

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
    
    // SETTERS
    public void setAlunoId(Long alunoId) {
    this.alunoId = alunoId;
}

public void setMateriaId(Long materiaId) {
    this.materiaId = materiaId;
}

public void setTipoId(Long tipoId) {
    this.tipoId = tipoId;
}

public void setTrimestre(Integer trimestre) {
    this.trimestre = trimestre;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public void setValorMax(Double valorMax) {
    this.valorMax = valorMax;
}

public void setNota(Double nota) {
    this.nota = nota;
}

public void setData(LocalDate data) {
    this.data = data;
}
}
