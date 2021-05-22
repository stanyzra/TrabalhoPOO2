/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import POJO.Consulta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aleix
 */
public class GerenciadorMsg extends usuario.Usuario {
    final DateTimeFormatter toBarras;

    public GerenciadorMsg() {
        this.toBarras = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    
    public void enviarMensagem(int horario, int telefone, String email){
        
        if(email.equals("") && telefone == 0)
            JOptionPane.showMessageDialog(null, "O paciente selecionado não possui telefone ou email para contato. Favor, cadastrar um.",
            "Enviar Mensagem",JOptionPane.ERROR_MESSAGE);
        else if (email.equals("") && telefone != 0){
            JOptionPane.showMessageDialog(null, "Mensagem 'Caro paciente, há uma consulta em seu nome marcada para o dia "
            +LocalDate.now().plusDays(1).format(toBarras)+ " às " +horario+" horas. Favor comparecer à consulta.' eviada para o celular do(a) paciente",
            "Enviar Mensagem (Telefone).", JOptionPane.INFORMATION_MESSAGE);
        }else if(!email.equals("") && telefone == 0){
            JOptionPane.showMessageDialog(null, "Mensagem 'Caro paciente, há uma consulta em seu nome marcada para o dia "
            +LocalDate.now().plusDays(1).format(toBarras)+ " às " +horario+" horas. Favor comparecer à consulta.' eviada para o email do(a) paciente",
            "Enviar Mensagem (Email).", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Mensagem 'Caro paciente, há uma consulta em seu nome marcada para o dia "
            +LocalDate.now().plusDays(1).format(toBarras)+ " às " +horario+" horas. Favor comparecer à consulta.' eviada para o celular e o email do(a) paciente",
            "Enviar Mensagem (Telefone e Email).", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void enviarMensagemTodos(List<Consulta> consultas){
        String nomesNaoEnviados = "";
        for (Consulta cons : consultas) {
            if (cons.getPaciente().getEmail().equals("") && cons.getPaciente().getTelefone() == 0){
                nomesNaoEnviados += cons.getPaciente().getNome() + "\n";
            }
        }
        if (nomesNaoEnviados.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os pacientes da lista receberam uma mensagem lembrando-as da sua consulta amanhã.",
                "Enviar Mensagens para Todos os Pacientes", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível enviar as mensagens para os seguintes pacientes por falta de email e celular: \n"+nomesNaoEnviados,
            "Enviar Mensagens para Todos os Pacientes", JOptionPane.WARNING_MESSAGE);
        }
    }
}
