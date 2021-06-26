/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author fmartins
 */
public class Main {
    
    
    public static void main(String[] args){
    
        String nome = "tiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "banho", 10);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Cliente cliente = new Cliente(1, "tiago", "Rua X, 123", "78837564");
        System.out.println(cliente.getNome());
    
        Usuario usuario = new Usuario(1, "barbeiro", "12345");
        System.out.println(usuario.getNome());
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 10, "23/06/2021 12:00");
        System.out.println(agendamento.getCliente().getNome());
        
    }
    
    
}
