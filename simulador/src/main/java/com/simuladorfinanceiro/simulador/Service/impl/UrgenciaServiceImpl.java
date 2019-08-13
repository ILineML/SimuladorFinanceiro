package com.simuladorfinanceiro.simulador.Service.impl;

import com.simuladorfinanceiro.simulador.Entitys.Urgencia;
import com.simuladorfinanceiro.simulador.Entitys.UrgenciaDAO;
import com.simuladorfinanceiro.simulador.Service.UrgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrgenciaServiceImpl implements UrgenciaService {

    @Autowired
    UrgenciaDAO urgenciaDAO;

    @Override
    public void save(Urgencia urgencia) {
        urgenciaDAO.save(urgencia);
    }
}
