package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.RendaVariavel;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSURENDAVAR")
public class UsuRendaVar {

    @Id
    @GeneratedValue
    private Long UsuRendaVarID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsu")
    private Usuario fkUsuRendVar;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idRendaVariavel")
    private RendaVariavel fkRendVar;

    @Column(name = "mesAno")
    private Date ano;

    @Column(name ="valor")
    private Double valorRendaVar;

    public Long getUsuRendaVarID() {
        return UsuRendaVarID;
    }

    public void setUsuRendaVarID(Long usuRendaVarID) {
        UsuRendaVarID = usuRendaVarID;
    }

    public Usuario getFkUsuRendVar() {
        return fkUsuRendVar;
    }

    public void setFkUsuRendVar(Usuario fkUsuRV) {
        this.fkUsuRendVar = fkUsuRendVar;
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

    public Double getValorRendaVar() {
        return valorRendaVar;
    }

    public void setValorRendaVar(Double valorRendaVar) {
        this.valorRendaVar = valorRendaVar;
    }
}
