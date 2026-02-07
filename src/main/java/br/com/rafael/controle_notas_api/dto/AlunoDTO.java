package br.com.rafael.controle_notas_api.dto;

public class AlunoDTO {

    private Long id;
    private String aluno;

    public AlunoDTO(Long id, String aluno) {
        this.id = id;
        this.aluno = aluno;
    }

    public Long getId() {
        return id;
    }

    public String getAluno() {
        return aluno;
    }
}