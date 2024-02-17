package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.Identity;

@Entity
public class Usuario {
    //por padrão qualquer atributo de uma classe será mapeado apra uma coluna no banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estrategia de geração de ID
    private long id;

    private String nome;
    private String email;

    public Usuario() {

    }

    public Usuario( String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
