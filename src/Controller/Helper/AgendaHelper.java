/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import static Model.DAO.Banco.servico;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author Felipe Martins
 */
public class AgendaHelper implements iHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
    
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{                
               agendamento.getId(),
               agendamento.getCliente().getNome(),
               agendamento.getServico().getDescricao(),
               agendamento.getValor(),
               agendamento.getDataFormatada(),
               agendamento.getHoraFormatada(),
               agendamento.getObservacao()
            });
                    
        }
        
        
    }
        
    public void preencherClientes(ArrayList<Cliente> clientes) {
        
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxCliente().getModel();
       
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente); //Aqui está o truque
            
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
        
    }
    public Cliente obterCliente() {
       return (Cliente) view.getjComboboxCliente().getSelectedItem();
    }    
    
    
    public Servico obterServico() {
       return (Servico) view.getjComboboxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTxtValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTxtId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTxtData().getText();
        String hora = view.getTxtHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTxtObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
        //new Agendamento
    }

    @Override
    public void limparTela() {
        view.getTxtId().setText("");
        view.getTxtData().setText("");
        view.getTxtHora().setText("");
        view.getTxtObservacao().setText("");
    }
    
    
    
}
