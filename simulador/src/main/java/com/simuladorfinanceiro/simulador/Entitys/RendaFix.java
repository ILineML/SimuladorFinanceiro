package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuInvestimentos;
import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuRendaFix;

import javax.persistence.*;
import java.io.Serializable;
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

    @OneToMany(mappedBy = "fkRendFix")
    private Set<UsuRendaFix> fkRendFix = new HashSet<>();

    public Set<UsuRendaFix> getFkRendFix() {
        return fkRendFix;
    }

    public void setFkRendFix(Set<UsuRendaFix> fkRendFix) {
        this.fkRendFix = fkRendFix;
    }

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

}
