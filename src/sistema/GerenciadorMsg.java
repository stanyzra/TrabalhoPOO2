/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
}
