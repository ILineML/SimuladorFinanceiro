package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.Receita;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSURECEITA")
public class UsuReceita {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario fkUsuRec;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Receita fkReceita;

    @Id
    private Date ano;

    @Column(name = "mes")
    private Integer mes;

    @Column(name ="valorReceita")
    private Double valorReceita;

    public Usuario getFkUsuRec() {
        return fkUsuRec;
    }

    public void setFkUsuRec(Usuario fkUsuRec) {
        this.fkUsuRec = fkUsuRec;
    }

    public Receita getFkReceita() {
        return fkReceita;
    }

    public void setFkReceita(Receita fkReceita) {
        this.fkReceita = fkReceita;
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

    public Double getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(Double valorReceita) {
        this.valorReceita = valorReceita;
    }
}
