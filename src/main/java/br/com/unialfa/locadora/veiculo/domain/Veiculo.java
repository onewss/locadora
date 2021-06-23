package br.com.unialfa.locadora.veiculo.domain;

import br.com.unialfa.locadora.categoria.domain.Categoria;
import br.com.unialfa.locadora.filial.domain.Filial;
import br.com.unialfa.locadora.grupo.domain.Grupo;
import br.com.unialfa.locadora.marca.domain.Marca;
import br.com.unialfa.locadora.modelo.domain.Modelo;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@SequenceGenerator(name="veiculo_sq", initialValue=1, allocationSize=100)
public class Veiculo {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="veiculo_sq")
    private long id;

    @ManyToOne
    private Marca marca;

    @ManyToOne
    private Modelo modelo;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Grupo grupo;

    @ManyToOne
    private Filial filial;

    private String motor;



    private String cambio;

    private int qtdPortas;

    private int capacidade;

    private String cor;

    private boolean vidroEletrico;

    private boolean arCondicionado;


    private String tipoDirecao;

    private String situacao;

    private LocalDate dtSituacao;

    public Veiculo(){

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }



    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(boolean vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDtSituacao() {
        return dtSituacao;
    }

    public void setDtSituacao(LocalDate dtSituacao) {
        this.dtSituacao = dtSituacao;
    }
}
