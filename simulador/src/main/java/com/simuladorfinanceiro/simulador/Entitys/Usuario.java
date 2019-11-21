package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBUSUARIO")
@SequenceGenerator(name = "usuario", sequenceName = "sqTbUser", allocationSize = 1)
public class Usuario {


    @Id
    @GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
    private Long idUsu;

    @Column(name = "nmUser", length = 20, unique = true)

    private String nmUser;

    @Column(name = "nmCliente", length = 90)
    private String nmCliente;

    @Column(name = "emailUser", unique = true, length = 100)
    private String email;

    @Column(name = "senhaUser", length = 14)
    private String senha;
/*
    @Column(name = "ftPerfil")
    @Lob
    private Byte[] ftPerfil;*/

    @OneToMany(mappedBy = "fkUsuInv")
    private Set<UsuInvestimentos> fkUsuInv = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuRec")
    private Set<UsuReceita> fkUsuRec = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuRendFix")
    private Set<UsuRendaFix> fkUsuRendFix = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuRendVar")
    private Set<UsuRendaVar> fkUsuRendVar = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuUrgen")
    private Set<UsuUrgencia> fkUsuUrgen = new HashSet<>();

    public Set<UsuInvestimentos> getFkUsuInv() {
        return fkUsuInv;
    }

    public void setFkUsuInv(Set<UsuInvestimentos> fkUsuInv) {
        this.fkUsuInv = fkUsuInv;
    }

    public Set<UsuReceita> getFkUsuRec() {
        return fkUsuRec;
    }

    public void setFkUsuRec(Set<UsuReceita> fkUsuRec) {
        this.fkUsuRec = fkUsuRec;
    }

    public Set<UsuRendaFix> getFkUsuRendFix() {
        return fkUsuRendFix;
    }

    public void setFkUsuRendFix(Set<UsuRendaFix> fkUsuRendFix) {
        this.fkUsuRendFix = fkUsuRendFix;
    }

    public Set<UsuRendaVar> getFkUsuRendVar() {
        return fkUsuRendVar;
    }

    public void setFkUsuRendaVar(Set<UsuRendaVar> fkUsuRendVar) {
        this.fkUsuRendVar = fkUsuRendVar;
    }

    public Set<UsuUrgencia> getFkUsuUrgen() {
        return fkUsuUrgen;
    }

    public void setFkUsuUrgen(Set<UsuUrgencia> fkUsuUrgen) {
        this.fkUsuUrgen = fkUsuUrgen;
    }

    public Long getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Long idUsu) {
        this.idUsu = idUsu;
    }

    public String getNmUser() {
        return nmUser;
    }

    public void setNmUser(String nmUser) {
        this.nmUser = nmUser;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
/*
    public Byte[] getFtPerfil() {
        return ftPerfil;
    }

    public void setFtPerfil(Byte[] ftPerfil) {
        this.ftPerfil = ftPerfil;
    }*/
}
