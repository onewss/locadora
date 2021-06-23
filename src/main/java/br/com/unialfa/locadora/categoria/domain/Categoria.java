package br.com.unialfa.locadora.categoria.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="categoria_sq", initialValue=1, allocationSize=100)
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoria_sq")
    private long id;
    private String nome;
    public Categoria(){

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
