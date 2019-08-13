package com.simuladorfinanceiro.simulador.Entitys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestimentosDAO extends JpaRepository<Investimentos, Long> {
}
