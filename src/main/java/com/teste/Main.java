package com.teste;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Victor", "victor@gmail.com");
        Pessoa p2 = new Pessoa(null, "João", "joao@gmail.com");
        Pessoa p3 = new Pessoa(null, "Gustavo", "Gustavo@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto");


    }
}