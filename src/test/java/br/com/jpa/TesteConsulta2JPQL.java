package br.com.jpa;

import br.com.jpa.model.Alunos;
import br.com.jpa.model.Formulario;
import br.com.jpa.model.RespostaAvaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesteConsulta2JPQL {
    public static void main (String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connection");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String sql2 = "select al from Alunos al where al = 1";
        TypedQuery<Alunos> query2 = entityManager.createQuery(sql2,Alunos.class);
        Alunos aluno = query2.getSingleResult();

        String sql = "select re from RespostaAvaliacao re where re.aluno = :pAluno";
        TypedQuery<RespostaAvaliacao> query = entityManager.createQuery(sql, RespostaAvaliacao.class);
        query.setParameter("pAluno", aluno);
        List<RespostaAvaliacao> respostasAvaliacao = query.getResultList();
        for(RespostaAvaliacao respostaAvaliacao : respostasAvaliacao){
            System.out.println(respostaAvaliacao.toString());
        }
    }
}
