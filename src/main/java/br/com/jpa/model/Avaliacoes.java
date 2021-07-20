package br.com.jpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Avaliacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @OneToMany(mappedBy = "avaliacao")
    private List<RespostaAvaliacao> respostas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<RespostaAvaliacao> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<RespostaAvaliacao> respostas) {
        this.respostas = respostas;
    }
}
