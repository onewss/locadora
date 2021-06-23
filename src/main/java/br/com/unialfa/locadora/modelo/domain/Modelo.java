package br.com.unialfa.locadora.modelo.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="modelo_sq", initialValue=1, allocationSize=100)
public class Modelo {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="modelo_sq")
    private long id;
    private String nome;

    public Modelo(){

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
}
