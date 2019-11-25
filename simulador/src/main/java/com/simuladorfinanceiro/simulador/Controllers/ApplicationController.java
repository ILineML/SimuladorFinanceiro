package com.simuladorfinanceiro.simulador.Controllers;

import com.simuladorfinanceiro.simulador.Entitys.*;
import com.simuladorfinanceiro.simulador.Entitys.EntityAssociative.*;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.awt.print.Pageable;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Controller
public class ApplicationController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private ReceitaDAO receitaDAO;

    private Usuario user;

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

    @Autowired
    JavaMailSender javaMailSender;

    String codigo = "";

    @GetMapping("/cadInvestimento")
    public String pageCadInv(){
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

    @GetMapping("/confirm")
    public String pageConfirmSenha(){
        return "confirm-password";
    }

    @GetMapping("/cadReceita")
    public String pageCadRec(){
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

        if(usuarioDAO.findEmail(email) != null){
            return new ResponseEntity("O email já está sendo utilizado.", HttpStatus.PRECONDITION_FAILED);
        } else if(usuarioDAO.findUserName(nmUser) != null){
            return new ResponseEntity("Nome de usuário já está sendo utilizado.", HttpStatus.PRECONDITION_FAILED);
        }

        List<String> letras = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "#");

        codigo = "";
        Random aleatorio = new Random();

        for(int i = 0; i < 8; i++){
            codigo += letras.get(aleatorio.nextInt(letras.size()) - 1);
        }

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("Código de confirmação de email");
        mailMessage.setText("Este é o código de confirmação de email: " + codigo + "\n");
        mailMessage.setText(mailMessage.getText() + "Você pode confirmar o código clicando neste link: \n");
        mailMessage.setText(mailMessage.getText() + "http://localhost:8080/confirm");
        mailMessage.setTo(email);

        user = new Usuario();
        user.setNmCliente(nmCliente);
        user.setNmUser(nmUser);
        user.setEmail(email);
        user.setSenha(senha);

        try{
            javaMailSender.send(mailMessage);
        } catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity("Ocorreu um erro ao enviar o email de confirmação", HttpStatus.PRECONDITION_FAILED);
        }

        return new ResponseEntity("Foi enviado um código de confirmação para o email: \n " + email, HttpStatus.OK);
    }

    @PostMapping("/cofirmacaoCode")
    @ResponseBody
    public ResponseEntity<String> cadastrarUser(@RequestParam("codigo") String cod){

        if(cod.equals(codigo)){
          usuarioDAO.save(user);
          return new ResponseEntity("/login", HttpStatus.OK);
        } else{
            return new ResponseEntity("Os códigos não se coincidem", HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @GetMapping("/entrar")
    public ResponseEntity<String> entrar(@RequestParam("login") String login, @RequestParam("senha") String senha,
                                         HttpSession session){

        Usuario dadosUser = usuarioDAO.findLogin(login, senha);

        if(dadosUser == null){
            return new ResponseEntity(HttpStatus.PRECONDITION_FAILED);
        } else{
            session.setAttribute("userLogado", dadosUser);
            return new ResponseEntity("/cadReceita", HttpStatus.OK);
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

    @RequestMapping("/sair")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

}
