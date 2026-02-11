package br.com.rafael.controle_notas_api.dto;

import br.com.rafael.controle_notas_api.model.Avaliacao;
import java.time.LocalDate;

public class AvaliacaoDTO {

    private Long id;
    private int trimestre;
    private String titulo;
    private String descricao;
    private double valorMax;
    private double nota;
    private LocalDate data;

    private Long alunoId;
    private String materia;
    private String tipo;

    public AvaliacaoDTO(Avaliacao a) {
        this.id = a.getId();
        this.trimestre = a.getTrimestre();
        this.titulo = a.getTitulo();
        this.descricao = a.getDescricao();
        this.valorMax = a.getValorMax();
        this.nota = a.getNota();
        this.data = a.getData();
        this.alunoId = a.getAluno().getId();
        this.materia = a.getMateria().getMateria();
        this.tipo = a.getTipo().getAvaliacao();
    }

    //GETTERS
    public Long getId() { return id; }
    public int getTrimestre() { return trimestre; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public double getValorMax() { return valorMax; }
    public double getNota() { return nota; }
    public LocalDate getData() { return data; }
    public Long getAlunoId() { return alunoId; }
    public String getMateriaId() { return materia; }
    public String getTipoId() { return tipo; }
}