package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuRendaFix;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBRENDAFIXA")
@SequenceGenerator(name = "rendafix", sequenceName = "seqTbFix", allocationSize = 1)
public class RendaFix {

    @Id
    @GeneratedValue(generator = "rendfix", strategy = GenerationType.SEQUENCE)
    private Long idRendaFix;

    @Column(name = "rendaFixa")
    private String rendaFixa;

    @Temporal(TemporalType.DATE)
    @Column(name = "mesAno")
    private Date mesAno;

    @Column(name = "valorRendFix")
    private Double valorRendVar;

    @OneToMany(mappedBy = "fkRendFix")
    private Set<UsuRendaFix> fkRendaFixa = new HashSet<>();

    public Long getIdRendaFix() {
        return idRendaFix;
    }

    public void setIdRendaFix(Long idRendaFix) {
        this.idRendaFix = idRendaFix;
    }

    public String getRendaFixa() {
        return rendaFixa;
    }

    public void setRendaFixa(String rendaFixa) {
        this.rendaFixa = rendaFixa;
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

    public Set<UsuRendaFix> getFkRendaFixa() {
        return fkRendaFixa;
    }

    public void setFkRendaFixa(Set<UsuRendaFix> fkRendaFixa) {
        this.fkRendaFixa = fkRendaFixa;
    }
}
