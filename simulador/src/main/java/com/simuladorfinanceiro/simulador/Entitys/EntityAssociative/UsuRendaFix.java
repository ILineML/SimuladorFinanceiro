package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.RendaFix;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TBUSURENDAFIX")
public class UsuRendaFix {

    @Id
    @GeneratedValue
    private Long UsuRendFixID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsu")
    private Usuario fkUsuRendFix;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idRendaFix")
    private RendaFix fkRendFix;

    @Column(name = "mesAno")
    private Date ano;

    @Column(name ="valorRendaFix")
    private Double valorRendaFix;

    public Long getUsuRendFixID() {
        return UsuRendFixID;
    }

    public void setUsuRendFixID(Long usuRendFixID) {
        UsuRendFixID = usuRendFixID;
    }

    public Usuario getFkUsuRendFix() {
        return fkUsuRendFix;
    }

    public void setFkUsuRendFix(Usuario fkUsuRendFix) {
        this.fkUsuRendFix = fkUsuRendFix;
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

    public Double getValorRendaFix() {
        return valorRendaFix;
    }

    public void setValorRendaFix(Double valorRendaFix) {
        this.valorRendaFix = valorRendaFix;
    }
}
