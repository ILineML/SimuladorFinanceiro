package com.simuladorfinanceiro.simulador.Controllers;

import com.simuladorfinanceiro.simulador.Entitys.Usuario;
import com.simuladorfinanceiro.simulador.Entitys.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ApplicationController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @GetMapping("/cadastro")
    public String pageCadastro(){
        return "register";
    }

    @GetMapping("/charts")
    public String pageCharts(){
        return "charts";
    }

    @GetMapping("/esqueci-senha")
    public String pageEsqueciSenha(){
        return "forgot-password";
    }

    @GetMapping("/index")
    public String pageIndex(){
        return "index";
    }

    @GetMapping("/login")
    public String pageLogin(){
        return "login";
    }

    @GetMapping("/tables")
    public String pageTables(){
        return "tables";
    }

    @PostMapping("/cadastrar")
    public String cadastrarUsu(@RequestParam("firstName") String nome, @RequestParam("lastName") String sobrenome,
                               @RequestParam("inputUser") String nmUser, @RequestParam("inputEmail") String email,
                               @RequestParam("inputPassoword") String senha, @RequestParam("ftPerfil") byte[] ftPerfil){

        Usuario user = new Usuario();

        user.setNmCliente(nome + sobrenome);
        user.setNmUser(nmUser);
        user.setEmail(email);
        user.setSenha(senha);
        user.setFtPerfil(ftPerfil);

        usuarioDAO.save(user);

        return "redirect:/login";
    }

    @GetMapping("/entrar")
    public String entrar(@RequestParam("inputLogin") String login, @RequestParam("inputSenha") String senha, Model model){

        if(usuarioDAO.findLogin(login, senha) == null){
            model.addAttribute("verificacao", 0);
            return "/login";
        } else{
            model.addAttribute("login", usuarioDAO.findLogin(login, senha));
            return "/charts";
        }

    }

}
