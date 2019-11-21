package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuInvestimentos;
import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuUrgencia;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBURGENCIA")
@SequenceGenerator(name = "urgencia", sequenceName = "seqTbUrgen", allocationSize = 1)
public class Urgencia {

    @Id
    @GeneratedValue(generator = "urgencia", strategy = GenerationType.SEQUENCE)
    private Long idRendaVariavel;

    @Column(name = "Urgencia")
    private String urgencia;

    @OneToMany(mappedBy = "fkUrgen")
    private Set<UsuUrgencia> fkUrgen = new HashSet<>();

    public Set<UsuUrgencia> getFkUrgen() {
        return fkUrgen;
    }

    public void setFkUrgen(Set<UsuUrgencia> fkUrgen) {
        this.fkUrgen = fkUrgen;
    }

    public Long getIdRendaVariavel() {
        return idRendaVariavel;
    }

    public void setIdRendaVariavel(Long idRendaVariavel) {
        this.idRendaVariavel = idRendaVariavel;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }


}
