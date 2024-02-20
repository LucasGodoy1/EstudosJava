package dominio;

import aplicacao.Pessoa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        // Criando um objeto do tipo pessoa, e está usando nulo no construtor
        // porque ja está configurado apra o JPA gerar um ID automaticamente
        Pessoa p1 = new Pessoa(null, "marcelo", "marcelo@gmail.com");
        Pessoa p2 = new Pessoa(null, "joaquin", "joaquin@gmail.com");
        Pessoa p3 = new Pessoa(null, "rafaela", "rafaela@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplosjpa");
        EntityManager em = emf.createEntityManager();;


                                             //Quando o JPA faz uma simples operação
        em.getTransaction().begin();         //que não é uma leitura
                                             //ele pede para fazer uma transação


        em.persist(p1); //esse é o metodo que salva no banco de dados o cadastro
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit(); //metodo para confirmar as alteções que fiz

        System.out.println("Pronto!!");
        em.close();
        emf.close();


    }
}
