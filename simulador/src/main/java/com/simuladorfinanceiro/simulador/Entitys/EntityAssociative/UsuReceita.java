package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import com.simuladorfinanceiro.simulador.Entitys.Receita;
import com.simuladorfinanceiro.simulador.Entitys.Usuario;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBUSURECEITA")
public class UsuReceita{

    @Id
    @GeneratedValue
    private Long UsuRecID;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsu")
    private Usuario fkUsuRec;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idReceita")
    private Receita fkReceita;

    @Column(name = "mesAno")
    private Date ano;

    @Column(name ="valorReceita")
    private Double valorReceita;

    public Long getUsuRecID() {
        return UsuRecID;
    }

    public void setUsuRecID(Long usuRecID) {
        UsuRecID = usuRecID;
    }

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

    public Double getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(Double valorReceita) {
        this.valorReceita = valorReceita;
    }
}
