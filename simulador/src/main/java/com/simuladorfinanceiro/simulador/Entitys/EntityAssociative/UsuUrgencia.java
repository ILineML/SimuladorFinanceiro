package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.Urgencia;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSUURGENCIA")
public class UsuUrgencia {

    @Id
    @GeneratedValue
    private Long usuUrgenID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsu")
    private Usuario fkUsuUrgen;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idRendaVariavel")
    private Urgencia fkUrgen;

    @Column(name = "mesAno")
    private Date ano;

    @Column(name ="valorUrgencia")
    private Double valorUrgencia;

    public Long getUsuUrgenID() {
        return usuUrgenID;
    }

    public void setUsuUrgenID(Long usuUrgenID) {
        this.usuUrgenID = usuUrgenID;
    }

    public Usuario getFkUsuUrgen() {
        return fkUsuUrgen;
    }

    public void setFkUsuUrgen(Usuario fkUsuUrgen) {
        this.fkUsuUrgen = fkUsuUrgen;
    }

    public Urgencia getFkUrgen() {
        return fkUrgen;
    }

    public void setFkUrgen(Urgencia fkUrgen) {
        this.fkUrgen = fkUrgen;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Double getValorUrgencia() {
        return valorUrgencia;
    }

    public void setValorUrgencia(Double valorUrgencia) {
        this.valorUrgencia = valorUrgencia;
    }
}
