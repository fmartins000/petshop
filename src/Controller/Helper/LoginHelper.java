/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author Felipe Martins
 */
public class LoginHelper implements iHelper{
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTxtUsuario().setText(nome);
        view.getTxtSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }
    
}
