package br.com.rafael.controle_notas_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos_avaliacao")
public class TipoAvaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String avaliacao;

    public Long getId() {
        return id;
    }
   
    
    public String getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
}
