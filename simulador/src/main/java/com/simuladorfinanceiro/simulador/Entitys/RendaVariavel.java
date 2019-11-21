package com.simuladorfinanceiro.simulador.Entitys;


import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuInvestimentos;
import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuRendaVar;

import javax.persistence.*;
import java.io.Serializable;
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

    @OneToMany(mappedBy = "fkRendVar")
    private Set<UsuRendaVar> fkRendVar = new HashSet<>();

    public Set<UsuRendaVar> getFkRendVar() {
        return fkRendVar;
    }

    public void setFkRendVar(Set<UsuRendaVar> fkRendVar) {
        this.fkRendVar = fkRendVar;
    }

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

}
