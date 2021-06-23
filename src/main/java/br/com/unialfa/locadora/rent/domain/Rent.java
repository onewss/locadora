package br.com.unialfa.locadora.rent.domain;

import br.com.unialfa.locadora.cliente.domain.Cliente;
import br.com.unialfa.locadora.plano.domain.Plano;
import br.com.unialfa.locadora.veiculo.domain.Veiculo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(name="locacao_sq", initialValue=1, allocationSize=100)
public class Rent {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="locacao_sq")
    private long id;
    private LocalDateTime dtHrInicioReserva;
    private LocalDateTime dtHrFimReserva;

    private LocalDateTime dtHrInicioRetirada;
    private LocalDateTime dtHrFimRetirada;


    @ManyToOne
    private Plano plano;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private Cliente cliente;

    private double desconto;

    private double valorTotal;

    private double valorFinal;

    public Rent() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDtHrInicioReserva() {
        return dtHrInicioReserva;
    }

    public void setDtHrInicioReserva(LocalDateTime dtHrInicioReserva) {
        this.dtHrInicioReserva = dtHrInicioReserva;
    }

    public LocalDateTime getDtHrFimReserva() {
        return dtHrFimReserva;
    }

    public void setDtHrFimReserva(LocalDateTime dtHrFimReserva) {
        this.dtHrFimReserva = dtHrFimReserva;
    }

    public LocalDateTime getDtHrInicioRetirada() {
        return dtHrInicioRetirada;
    }

    public void setDtHrInicioRetirada(LocalDateTime dtHrInicioRetirada) {
        this.dtHrInicioRetirada = dtHrInicioRetirada;
    }

    public LocalDateTime getDtHrFimRetirada() {
        return dtHrFimRetirada;
    }

    public void setDtHrFimRetirada(LocalDateTime dtHrFimRetirada) {
        this.dtHrFimRetirada = dtHrFimRetirada;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
