package br.com.jpa.model;

import javax.persistence.*;

@Entity
public class RespostaAvaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String resposta;
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Alunos aluno;
    @ManyToOne
    @JoinColumn(name = "avalicao_id")
    private Avaliacoes avaliacao;
    @OneToOne(mappedBy = "respostaAvaliacao" )
    @JoinColumn(unique = true)

    private Formulario formulario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Avaliacoes getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacoes avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    @Override
    public String toString() {
        return "RespostaAvaliacao{" +
                "id=" + id +
                ", resposta='" + resposta + '\'' +
                ", aluno=" + aluno +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
