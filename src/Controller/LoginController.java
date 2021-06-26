/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.MenuPrincipal;
import view.Login;

/**
 *
 * @author Felipe Martins
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    
    
    
    public void entrarNoSistema(){
        
        //Pegar Usuário da View
        Usuario usuario = helper.obterModelo();

        //Pesquisar Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o Usuario da View tiver o mesmo usuario e senha que o usuario vindo do banco, direcionar para o menu
        //Senão mostrar uma mensagem ao usuário "Usuario ou senha invalidos"
        if(usuarioAutenticado!= null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else {
            view.exibeMensagem("Usuário ou senha inválidos.");
        }
        

    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
        
       
    }
    
    
    
}
