package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.UsuReceita;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "TBRECEITA")
@SequenceGenerator(name = "receita", sequenceName = "seqTbRec", allocationSize = 1)
public class Receita {

    @Id
    @GeneratedValue(generator = "receita", strategy = GenerationType.SEQUENCE)
    private Long idReceita;

    @Column(name = "receita")
    private String receita;

    @OneToMany(mappedBy = "fkReceita")
    private Set<UsuReceita> fkReceita = new HashSet<>();

    public Long getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Long idReceita) {
        this.idReceita = idReceita;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public Set<UsuReceita> getFkReceita() {
        return fkReceita;
    }

    public void setFkReceita(Set<UsuReceita> fkReceita) {
        this.fkReceita = fkReceita;
    }
}
