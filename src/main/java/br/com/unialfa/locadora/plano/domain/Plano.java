package br.com.unialfa.locadora.plano.domain;

import br.com.unialfa.locadora.grupo.domain.Grupo;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@SequenceGenerator(name="plano_sq", initialValue=1, allocationSize=100)
public class Plano {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="plano_sq")
    private long id;

    private String nome;

    private String descricao;

    @ManyToOne
    private Grupo grupo;

    private BigDecimal valor;

    public Plano(){

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
