package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.RendaVariavel;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSURENDAVAR")
public class UsuRendaVar {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario fkUsuRV;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RendaVariavel fkRendVar;

    @Id
    private Date ano;

    @Column(name = "mes")
    private Integer mes;

    @Column(name ="valor")
    private Double valorRendaVar;

    public Usuario getFkUsuRV() {
        return fkUsuRV;
    }

    public void setFkUsuRV(Usuario fkUsuRV) {
        this.fkUsuRV = fkUsuRV;
    }

    public RendaVariavel getFkRendVar() {
        return fkRendVar;
    }

    public void setFkRendVar(RendaVariavel fkRendVar) {
        this.fkRendVar = fkRendVar;
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

    public Double getValorRendaVar() {
        return valorRendaVar;
    }

    public void setValorRendaVar(Double valorRendaVar) {
        this.valorRendaVar = valorRendaVar;
    }
}
