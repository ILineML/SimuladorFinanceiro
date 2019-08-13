package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuInvestimentos;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBINVESTIMENTOS")
@SequenceGenerator(name = "investimentos", sequenceName = "seqTbInv", allocationSize = 1)
public class Investimentos {

    @Id
    @GeneratedValue(generator = "investimentos", strategy = GenerationType.SEQUENCE)
    private Long idInvestimento;

    @Column(name = "Investimento")
    private String investimento;

    @Temporal(TemporalType.DATE)
    @Column(name = "mesAno")
    private Date mesAno;

    @Column(name = "valorInvestimento")
    private Double valorInvest;

    @OneToMany(mappedBy = "fkInvestimento")
    private Set<UsuInvestimentos> fkInvestimento = new HashSet<>();

    public Long getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(Long idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getInvestimento() {
        return investimento;
    }

    public void setInvestimento(String investimento) {
        this.investimento = investimento;
    }

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }

    public Double getValorInvest() {
        return valorInvest;
    }

    public void setValorInvest(Double valorInvest) {
        this.valorInvest = valorInvest;
    }

    public Set<UsuInvestimentos> getFkInvestimento() {
        return fkInvestimento;
    }

    public void setFkInvestimento(Set<UsuInvestimentos> fkInvestimento) {
        this.fkInvestimento = fkInvestimento;
    }
}