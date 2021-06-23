package br.com.unialfa.locadora.cliente.domain;
import br.com.unialfa.locadora.rent.domain.Rent;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
@Entity
@SequenceGenerator(name="cliente_sq", initialValue=1, allocationSize=100)
public class Cliente  implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_sq")
    private long id;
    private String nome;
    private String primeiroNome;

    @Column(unique = true, nullable = false)
    private String cpf;
    private LocalDate dataNascimento;
    private int versao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Rent> rents;

    public Cliente() {
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

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public List<Rent> getRents() {
       return rents;
    }
    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }
}
