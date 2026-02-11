package br.com.rafael.controle_notas_api.dto;

import br.com.rafael.controle_notas_api.model.Materia;

public class MateriaDTO {

    private Long id;
    private String materia;

    public MateriaDTO(Materia m) {
        this.id = m.getId();
        this.materia = m.getMateria();
    }

    public Long getId() {
        return id;
    }

    public String getMateria() {
        return materia;
    }
}
