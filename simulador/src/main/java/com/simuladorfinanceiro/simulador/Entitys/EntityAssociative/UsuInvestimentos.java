package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.Investimentos;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSUINVESTIMENTOS")
public class UsuInvestimentos {

    @Id
    @GeneratedValue
    private Long UsuInvID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsu")
    private Usuario fkUsuInv;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idInvestimento")
    private Investimentos fkInv;

    @Column(name = "mesAno")
    private Date ano;

    @Column(name ="valorInvestimento")
    private Double valorInvestimento;

    public Long getUsuInvID() {
        return UsuInvID;
    }

    public void setUsuInvID(Long usuInvID) {
        UsuInvID = usuInvID;
    }

    public Usuario getFkUsuInv() {
        return fkUsuInv;
    }

    public void setFkUsuInv(Usuario fkUsuInv) {
        this.fkUsuInv = fkUsuInv;
    }

    public Investimentos getFkInv() {
        return fkInv;
    }

    public void setFkInv(Investimentos fkInv) {
        this.fkInv = fkInv;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(Double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }
}
