package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuUrgencia;

import javax.persistence.*;
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

    @Temporal(TemporalType.DATE)
    @Column(name = "mesAno")
    private Date mesAno;

    @Column(name = "valorRendVar")
    private Double valorUrgen;

    @OneToMany(mappedBy = "fkUrgencia")
    private Set<UsuUrgencia> fkUrgencia = new HashSet<>();

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

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }

    public Double getValorUrgen() {
        return valorUrgen;
    }

    public void setValorUrgen(Double valorUrgen) {
        this.valorUrgen = valorUrgen;
    }

    public Set<UsuUrgencia> getFkUrgencia() {
        return fkUrgencia;
    }

    public void setFkUrgencia(Set<UsuUrgencia> fkUrgencia) {
        this.fkUrgencia = fkUrgencia;
    }
}
