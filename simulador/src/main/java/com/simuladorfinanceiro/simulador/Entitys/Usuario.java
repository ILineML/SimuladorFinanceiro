package com.simuladorfinanceiro.simulador.Entitys;

import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBUSUARIO")
@SequenceGenerator(name = "usuario", sequenceName = "sqTbUser", allocationSize = 1)
public class Usuario {


    @Id
    @GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
    private Long idUsu;

    @Column(name = "nmUser", length = 20)
    private String nmUser;

    @Column(name = "nmCliente", length = 90)
    private String nmCliente;

    @Column(name = "emailUser", unique = true)
    @Email
    private String email;

    @Column(name = "senhaUser", length = 14)
    private String senha;

    @Column(name = "ftPerfil")
    @Lob
    private byte[] ftPerfil;

    @OneToMany(mappedBy = "fkUsuRec")
    private Set<UsuReceita> fkUsuRec = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuRF")
    private Set<UsuRendaFix> fkUsuRF = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuRV")
    private Set<UsuRendaVar> fkUsuRV = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuInv")
    private Set<UsuInvestimentos> fkUsuIn = new HashSet<>();

    @OneToMany(mappedBy = "fkUsuUrgen")
    private Set<UsuUrgencia> fkUsuUrgen = new HashSet<>();


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

    public byte[] getFtPerfil() {
        return ftPerfil;
    }

    public void setFtPerfil(byte[] ftPerfil) {
        this.ftPerfil = ftPerfil;
    }

    public Set<UsuReceita> getFkUsuRec() {
        return fkUsuRec;
    }

    public void setFkUsu(Set<UsuReceita> fkUsuRec) {
        this.fkUsuRec = fkUsuRec;
    }

    public void setFkUsuRec(Set<UsuReceita> fkUsuRec) {
        this.fkUsuRec = fkUsuRec;
    }

    public Set<UsuRendaFix> getFkUsuRF() {
        return fkUsuRF;
    }

    public void setFkUsuRF(Set<UsuRendaFix> fkUsuRF) {
        this.fkUsuRF = fkUsuRF;
    }

    public Set<UsuRendaVar> getFkUsuRV() {
        return fkUsuRV;
    }

    public void setFkUsuRV(Set<UsuRendaVar> fkUsuRV) {
        this.fkUsuRV = fkUsuRV;
    }

    public Set<UsuInvestimentos> getFkUsuIn() {
        return fkUsuIn;
    }

    public void setFkUsuIn(Set<UsuInvestimentos> fkUsuIn) {
        this.fkUsuIn = fkUsuIn;
    }

    public Set<UsuUrgencia> getFkUsuUrgen() {
        return fkUsuUrgen;
    }

    public void setFkUsuUrgen(Set<UsuUrgencia> fkUsuUrgen) {
        this.fkUsuUrgen = fkUsuUrgen;
    }
}
