package com.simuladorfinanceiro.simulador.Entitys.EntityAssociative;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuInvestimentosDAO extends JpaRepository<UsuInvestimentos, Long> {
}
