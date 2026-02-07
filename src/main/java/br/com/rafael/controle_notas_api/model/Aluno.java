package br.com.rafael.controle_notas_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos") // nome EXATO da tabela no banco
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String aluno;

    @Column(name = "senha")
    private String senha;

    // 🔹 Construtor vazio (OBRIGATÓRIO pro JPA)
    public Aluno() {
    }

    // 🔹 Getters e Setters
    public Long getId() {
        return id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}