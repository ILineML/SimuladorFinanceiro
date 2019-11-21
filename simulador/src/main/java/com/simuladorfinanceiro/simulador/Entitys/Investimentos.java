package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuInvestimentos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBINVESTIMENTOS")
@SequenceGenerator(name = "investimentos", sequenceName = "seqTbInv", allocationSize = 1)
public class Investimentos{

    @Id
    @GeneratedValue(generator = "investimentos", strategy = GenerationType.SEQUENCE)
    private Long idInvestimento;

    @Column(name = "Investimento")
    private String investimento;

    @OneToMany(mappedBy = "fkInv")
    private Set<UsuInvestimentos> fkInv = new HashSet<>();

    public Set<UsuInvestimentos> getFkInv() {
        return fkInv;
    }

    public void setFkInv(Set<UsuInvestimentos> fkInv) {
        this.fkInv = fkInv;
    }

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

}