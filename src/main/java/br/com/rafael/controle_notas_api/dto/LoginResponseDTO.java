package br.com.rafael.controle_notas_api.dto;

import br.com.rafael.controle_notas_api.model.Aluno;

public class LoginResponseDTO {

    private Long id;
    private String aluno;
    
    public LoginResponseDTO(Long id, String aluno) {
        this.id = id;
        this.aluno = aluno;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getAluno(){
        return aluno;
    }
}