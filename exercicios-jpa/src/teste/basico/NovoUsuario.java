package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();;

        Usuario novoUsuario = new Usuario("zeca", "zecazinho@lanche.com.br");


        em.getTransaction().begin(); //para iniciar a transação
        em.persist(novoUsuario); //insert no banco de dados
        em.getTransaction().commit(); //efetivar a transação no banco de dados


        em.close();
        emf.close();

    }
}
