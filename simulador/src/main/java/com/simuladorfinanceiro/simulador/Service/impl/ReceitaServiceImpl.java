package com.simuladorfinanceiro.simulador.Service.impl;

import com.simuladorfinanceiro.simulador.Entitys.Receita;
import com.simuladorfinanceiro.simulador.Entitys.ReceitaDAO;
import com.simuladorfinanceiro.simulador.Service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceitaServiceImpl implements ReceitaService {

    @Autowired
    ReceitaDAO receitaDAO;

    @Override
    public void save(Receita receita) {
        receitaDAO.save(receita);
    }
}
