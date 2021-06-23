package br.com.unialfa.locadora.grupo.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="grupo_sq", initialValue=1, allocationSize=100)
public class Grupo {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="grupo_sq")
    private long id;
    private String nome;

    public Grupo(){

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
