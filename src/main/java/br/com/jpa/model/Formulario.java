package br.com.jpa.model;

import javax.persistence.*;

@Entity
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nota;
    @OneToOne
    private RespostaAvaliacao respostaAvaliacao;

    public Formulario(Long id) {
        this.id = id;
    }
    public Formulario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public RespostaAvaliacao getRespostaAvaliacao() {
        return respostaAvaliacao;
    }

    public void setRespostaAvaliacao(RespostaAvaliacao respostaAvaliacao) {
        this.respostaAvaliacao = respostaAvaliacao;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "id=" + id +
                ", nota=" + nota +
                ", respostaAvaliacao=" + respostaAvaliacao +
                '}';
    }
}
