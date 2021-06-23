package br.com.unialfa.locadora.marca.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="marca_sq", initialValue=1, allocationSize=100)
public class Marca {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_sq")
    private long id;
    private String nome;

    public Marca(){

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
