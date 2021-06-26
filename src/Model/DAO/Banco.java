/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "veterinaria", 'M', "09/05/1996", "30212121", "veterinaria@caozinhofeliz.com", "521454123", "12345", "administrador");
        Usuario usuario2 = new Usuario(2, "estagiaria", 'M', "09/05/1996", "30212122", "estagiario@caozinhofeliz.com", "451244123", "54321", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Joana Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        
        Servico servico1 = new Servico(1, "Banho", 30);
        Servico servico2 = new Servico(2, "Tosa", 35);
        Servico servico3 = new Servico(3, "Consulta", 15);
        Servico servico4 = new Servico(4, "Vacina", 40);
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
       
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        
        
    }
    
    
}
