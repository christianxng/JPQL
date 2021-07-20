package br.com.jpa;

import br.com.jpa.model.Alunos;
import br.com.jpa.model.Formulario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesteConsultaJPQL {
    public static void main (String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connection");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String sql2 = "select fo from Formulario fo where fo = 1";
        TypedQuery<Formulario> query2 = entityManager.createQuery(sql2,Formulario.class);
        Formulario formulario = query2.getSingleResult();

        String sql = "select al from Alunos al join al.respostaAvaliacao ra join ra.formulario fo  where fo = :pFormulario";
        TypedQuery<Alunos> query = entityManager.createQuery(sql,Alunos.class);
        query.setParameter("pFormulario", formulario);
        Alunos aluno = query.getSingleResult();
        System.out.println("Nome Aluno: "+aluno.getNome());



    }
}
