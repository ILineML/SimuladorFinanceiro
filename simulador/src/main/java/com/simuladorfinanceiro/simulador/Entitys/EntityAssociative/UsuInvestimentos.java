package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.Investimentos;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSUINVESTIMENTOS")
public class UsuInvestimentos {
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario fkUsuInv;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Investimentos fkInvestimento;

    @Id
    private Date ano;

    @Column(name = "mes")
    private Integer mes;

    @Column(name ="valorInvestimento")
    private Double valorInvestimento;

    public Usuario getFkUsuInv() {
        return fkUsuInv;
    }

    public void setFkUsuInv(Usuario fkUsuInv) {
        this.fkUsuInv = fkUsuInv;
    }

    public Investimentos getFkInvestimento() {
        return fkInvestimento;
    }

    public void setFkInvestimento(Investimentos fkInvestimento) {
        this.fkInvestimento = fkInvestimento;
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

    public Double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(Double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }
}
