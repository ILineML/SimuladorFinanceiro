package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.Urgencia;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSUURGENCIA")
public class UsuUrgencia {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario fkUsuUrgen;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Urgencia fkUrgencia;

    @Id
    private Date ano;

    @Column(name = "mes")
    private Integer mes;

    @Column(name ="valorUrgencia")
    private Double valorUrgencia;

    public Usuario getFkUsuUrgen() {
        return fkUsuUrgen;
    }

    public void setFkUsuUrgen(Usuario fkUsuUrgen) {
        this.fkUsuUrgen = fkUsuUrgen;
    }

    public Urgencia getFkUrgencia() {
        return fkUrgencia;
    }

    public void setFkUrgencia(Urgencia fkUrgencia) {
        this.fkUrgencia = fkUrgencia;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Double getValorUrgencia() {
        return valorUrgencia;
    }

    public void setValorUrgencia(Double valorUrgencia) {
        this.valorUrgencia = valorUrgencia;
    }
}
