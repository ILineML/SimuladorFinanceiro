package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuReceitaDAO extends JpaRepository<UsuReceita, Long> {

}
