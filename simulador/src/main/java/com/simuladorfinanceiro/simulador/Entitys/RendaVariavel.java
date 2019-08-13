package com.simuladorfinanceiro.simulador.Entitys;


import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuRendaVar;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "TBRENDAVARIAVEL")
@SequenceGenerator(name = "rendavariavel", sequenceName = "seqTbVar", allocationSize = 1)
public class RendaVariavel {

    @Id
    @GeneratedValue(generator = "rendavariavel", strategy = GenerationType.SEQUENCE)
    private Long idRendaVariavel;

    @Column(name = "rendaVariavel")
    private String rendaVariavel;

    @Temporal(TemporalType.DATE)
    @Column(name = "mesAno")
    private Date mesAno;

    @Column(name = "valorRendVar")
    private Double valorRendVar;

    @OneToMany(mappedBy = "fkRendVar")
    private Set<UsuRendaVar> fkRendVar = new HashSet<>();

    public Long getIdRendaVariavel() {
        return idRendaVariavel;
    }

    public void setIdRendaVariavel(Long idRendaVariavel) {
        this.idRendaVariavel = idRendaVariavel;
    }

    public String getRendaVariavel() {
        return rendaVariavel;
    }

    public void setRendaVariavel(String rendaVariavel) {
        this.rendaVariavel = rendaVariavel;
    }

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }

    public Double getValorRendVar() {
        return valorRendVar;
    }

    public void setValorRendVar(Double valorRendVar) {
        this.valorRendVar = valorRendVar;
    }

    public Set<UsuRendaVar> getFkRendVar() {
        return fkRendVar;
    }

    public void setFkRendVar(Set<UsuRendaVar> fkRendVar) {
        this.fkRendVar = fkRendVar;
    }
}
