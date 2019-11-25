package com.simuladorfinanceiro.simulador.Controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object controller) throws Exception {

        String uri = request.getRequestURI();

        //Permissão de URLs que não tem necessidade de estar logado
        if(uri.endsWith("login") || uri.endsWith("entrar") ||
            uri.contains("confirm") || uri.contains("cofirmacaoCode") ||
                    uri.contains("cadastrar") || uri.contains("cadastro")){
            return true;
        }

        //Permissão de arquivos de acesso aos arquivos do site
        if(uri.contains("css") || uri.contains("js") || uri.contains("img") ||
                uri.contains("scss") || uri.contains("vendor")){
            return true;
        }

        //Se o usuário estiver logado, é true
        if(request.getSession().getAttribute("userLogado") != null) {
            return true;
        }

        //Caso nada seja verdadeiro, retorna ao login
        response.sendRedirect("/login");
        return false;
    }

}
