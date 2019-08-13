package com.simuladorfinanceiro.simulador.Service.impl;

import com.simuladorfinanceiro.simulador.Entitys.Usuario;
import com.simuladorfinanceiro.simulador.Entitys.UsuarioDAO;
import com.simuladorfinanceiro.simulador.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public void save(Usuario usuario){
        usuarioDAO.save(usuario);
    }

}
