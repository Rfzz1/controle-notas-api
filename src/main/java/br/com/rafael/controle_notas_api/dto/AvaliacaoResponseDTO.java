/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rafael.controle_notas_api.dto;

import java.time.LocalDate;

/**
 *
 * @author Rafa
 */
public class AvaliacaoResponseDTO {
    private Long id;
    private Long alunoId;
    private Long materiaId;
    private Long tipoId;
    private Double nota;
    private Double valorMax;
    private String titulo;
    private String descricao;
    private LocalDate data;
    private Integer trimestre;
    private String materiaNome;
    
    // GETTERS E SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long AlunoId() {
        return alunoId;
    }
    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }
    public Long getMateriaId() {
        return materiaId;
    }
    public void setMateriaId(Long materiaId) {
        this.materiaId = materiaId;
    }
    public Long getTipoId() {
        return tipoId;
    }
    public void setTipoId(Long tipoId) {
        this.tipoId = tipoId;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
    public Double getValorMax() {
        return valorMax;
    }
    public void setValorMax(Double valorMax) {
        this.valorMax = valorMax;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
         this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Integer getTrimestre() {
        return trimestre;
    }
    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }
    public String getMateriaNome() {
        return materiaNome;
    }
    public void setMateriaNome(String materiaNome) {
        this.materiaNome = materiaNome;
    }
}
    

     
