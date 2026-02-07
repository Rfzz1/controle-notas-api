package br.com.rafael.controle_notas_api.dto;

public class MateriaDTO {

    private Long id;
    private String materia;

    public MateriaDTO(Long id, String materia) {
        this.id = id;
        this.materia = materia;
    }

    public Long getId() {
        return id;
    }

    public String getMateria() {
        return materia;
    }
}
