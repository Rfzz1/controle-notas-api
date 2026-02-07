package br.com.rafael.controle_notas_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // aluno_id
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    // materia_id
    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;

    // tipo_id
    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private TipoAvaliacao tipo;

    private int trimestre;
    private String titulo;
    private String descricao;

    @Column(name = "valor_max")
    private Double valorMax;

    private Double nota;

    private LocalDate data;
    
    
        // getters
    public Long getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Materia getMateria() {
        return materia;
    }

    public TipoAvaliacao getTipo() {
        return tipo;
    }
    
    public int getTrimestre() {
        return trimestre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorMax() {
        return valorMax;
    }

    public double getNota() {
        return nota;
    }

    public LocalDate getData() {
        return data;
    }

    // SETTERS
   
public void setAluno(Aluno aluno) {
    this.aluno = aluno;
}

public void setMateria(Materia materia) {
    this.materia = materia;
}

public void setTipo(TipoAvaliacao tipo) {
    this.tipo = tipo;
}

public void setTrimestre(int trimestre) {
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
