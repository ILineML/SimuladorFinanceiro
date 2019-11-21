package com.simuladorfinanceiro.simulador.Controllers;

import com.simuladorfinanceiro.simulador.Entitys.*;
import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.*;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.print.Pageable;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


@Controller
public class ApplicationController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private ReceitaDAO receitaDAO;

    @Autowired
    private InvestimentosDAO investimentosDAO;

    @Autowired
    private RendaVariavelDAO rendaVariavelDAO;

    @Autowired
    private RendaFixDAO rendaFixDAO;

    @Autowired
    private UrgenciaDAO urgenciaDAO;

    @Autowired
    private UsuReceitaDAO usuReceitaDAO;

    @Autowired
    private UsuInvestimentosDAO usuInvestimentosDAO;

    @Autowired
    private UsuRendaFixDAO usuRendaFixDao;

    @Autowired
    private UsuRendaVarDAO usuRendaVarDAO;

    @Autowired
    private UsuUrgenciaDAO usuUrgenciaDAO;

    @GetMapping("/cadInvestimento")
    public String pageCadInv(Model model){
        return "cadInvestimentos";
    }

    @GetMapping("/cadastro")
    public String pageCadastro(){
        return "register";
    }

    @GetMapping("/charts")
    public String pageCharts(){
        return "graficos";
    }

    @GetMapping("/esqueci-senha")
    public String pageEsqueciSenha(){
        return "forgot-password";
    }

    @GetMapping("/cadReceita")
    public String pageCadRec(Model model){

        return "cadReceita";
    }

    @GetMapping("/cadUrgencias")
    public String pageUrgen(){
        return "cadUrgen";
    }

    @GetMapping("/login")
    public String pageLogin(){
        return "login";
    }

    @GetMapping("/cadRendas")
    public String pageRendas(){
        return "cadRendas";
    }

    @PostMapping("/cadastrar")
    @ResponseBody
    public ResponseEntity<String> cadastrarUsu(@RequestParam("nmCliente") String nmCliente, @RequestParam("nmUser") String nmUser,
                                       @RequestParam("email") String email, @RequestParam("senha") String senha){

        Usuario user = new Usuario();
        user.setNmCliente(nmCliente);
        user.setNmUser(nmUser);
        user.setEmail(email);
        user.setSenha(senha);

        try{
            usuarioDAO.save(user);
        } catch (DataIntegrityViolationException sql){

            if(usuarioDAO.findEmail(email) == null){
                return new ResponseEntity("Nome de usuário já está sendo utilizado.", HttpStatus.NOT_ACCEPTABLE);
            } else{
                return new ResponseEntity("O email já está sendo utilizado.", HttpStatus.NOT_ACCEPTABLE);
            }


        } catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity("/login", HttpStatus.OK);
    }

    @GetMapping("/entrar")
    public String entrar(@RequestParam("inputLogin") String login, @RequestParam("inputSenha") String senha, Model model){

        if(usuarioDAO.findLogin(login, senha) == null){
            model.addAttribute("verificacao", 0);
            return "/login";
        } else{
            model.addAttribute("login", usuarioDAO.findLogin(login, senha));
            return "/cadReceita";
        }

    }

    @PostMapping("/cadReceitas")
    public String cadastrarReceitas(@RequestParam("txtReceita") String receita,
                                    @RequestParam("txtValor") Double valor, Receita rec, UsuReceita usuRec,
                                    @RequestParam("idUser") Usuario id){

/*
            rec.setReceita(receita);
            receitaDAO.save(rec);
            usuRec.setFkUsuRec(id);
            usuRec.setValorReceita(valor);
            usuReceitaDAO.save(usuRec);
*/
        return "redirect:/cadReceita";
    }


}
