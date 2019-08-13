package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.RendaFix;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TBUSURENDAFIX")
public class UsuRendaFix {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario fkUsuRF;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RendaFix fkRendFix;

    @Id
    private Date ano;

    @Column(name = "mes")
    private Integer mes;

    @Column(name ="valorRendaFix")
    private Double valorRendaFix;


    public Usuario getFkUsuRF() {
        return fkUsuRF;
    }

    public void setFkUsuRF(Usuario fkUsuRF) {
        this.fkUsuRF = fkUsuRF;
    }

    public RendaFix getFkRendFix() {
        return fkRendFix;
    }

    public void setFkRendFix(RendaFix fkRendFix) {
        this.fkRendFix = fkRendFix;
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

    public Double getValorRendaFix() {
        return valorRendaFix;
    }

    public void setValorRendaFix(Double valorRendaFix) {
        this.valorRendaFix = valorRendaFix;
    }
}
