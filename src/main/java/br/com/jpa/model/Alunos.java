package br.com.jpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Alunos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    @OneToMany(mappedBy = "aluno")
    private List<RespostaAvaliacao> respostaAvaliacao;

    public Alunos (){ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<RespostaAvaliacao> getRespostaAvaliacao() {
        return respostaAvaliacao;
    }

    public void setRespostaAvaliacao(List<RespostaAvaliacao> respostaAvaliacao) {
        this.respostaAvaliacao = respostaAvaliacao;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }
}
