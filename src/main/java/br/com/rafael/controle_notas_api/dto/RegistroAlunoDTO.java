
package br.com.rafael.controle_notas_api.dto;

public class RegistroAlunoDTO {
    private String aluno;
    private String senha;
    
    public String getAluno() { return aluno; }
    public void setAluno(String aluno) { this.aluno = aluno; }
    
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
