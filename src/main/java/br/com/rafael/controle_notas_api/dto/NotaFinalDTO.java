
package br.com.rafael.controle_notas_api.dto;

public class NotaFinalDTO {
    private Long materiaId;
    private String materia;
    private Double soma;
    
    public NotaFinalDTO(Long materiaId, String materia, Double soma) {
        this.materiaId = materiaId;
        this.materia = materia;
        this.soma = soma;
    }
    
    public Long getMateriaId() { return materiaId; }
    public String getMateria() { return materia; }
    public Double getSoma() { return soma; }
}
