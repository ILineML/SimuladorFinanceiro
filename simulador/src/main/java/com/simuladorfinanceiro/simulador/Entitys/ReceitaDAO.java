package com.simuladorfinanceiro.simulador.Entitys;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ReceitaDAO extends JpaRepository<Receita, Long> {

    @Query("Select r from Receita r where r.idReceita < 4")
    List<?> findReceitas();

    @Query("Select r.idReceita from Receita r order by r.idReceita")
    List<?> maxReceita();

}
