package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuRendaVarDAO extends JpaRepository<UsuRendaVar, Long> {
}
