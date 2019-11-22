package com.simuladorfinanceiro.simulador.Entitys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario ,Long>{

    @Query("select u from Usuario u where (u.nmUser = ?1 OR u.email = ?1) AND u.senha = ?2")
    Usuario findLogin(String login, String senha);

    @Query("select u from Usuario u where u.email = ?1")
    Usuario findEmail(String email);

    @Query("select u from Usuario u where u.nmUser = ?1")
    Usuario findUserName(String username);

}
