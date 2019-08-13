package com.simuladorfinanceiro.simulador.Entitys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    @Query("select u from Usuario u where u.nmUser = ?1 AND u.senha = ?2")
    Usuario findLogin(String login, String senha);

}
