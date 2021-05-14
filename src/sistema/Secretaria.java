package sistema;

import DAO.GenericDAO;
import POJO.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleix
 */
public class Secretaria extends usuario.Usuario {
    
    public Secretaria() {
    }
  
    public void cadastrarPaciente(ArrayList dados){
        
        int tel;
        String nome, bairro, cidade, rua, tipoPlano; 
        LocalDate dataNasc;
        
        Paciente pacienteNovo = new Paciente();
        GenericDAO<Paciente> dao = new GenericDAO<>();
        
        nome = (String) dados.get(0);
        tel =  Integer.parseInt(dados.get(1).toString());
        bairro = (String) dados.get(2);
        cidade = (String) dados.get(3);
        rua = (String) dados.get(4);
        tipoPlano = (String) dados.get(5);
        dataNasc = (LocalDate) dados.get(6);

        pacienteNovo.setNome(nome);
        pacienteNovo.setBairro(bairro);
        pacienteNovo.setCidade(cidade);
        pacienteNovo.setRua(rua);
        pacienteNovo.setTelefone(tel);
        pacienteNovo.setLocalDateNasc(dataNasc);
        pacienteNovo.setTipoPlano(tipoPlano);
        pacienteNovo.setConsultaCadastrada(false);
        dao.salvar(pacienteNovo);
    }
    
        public void atualizarPaciente(ArrayList dados){
        GenericDAO<Paciente> dao = new GenericDAO<>();

        int tel;
        String nome, bairro, cidade, rua, tipoPlano; 
        LocalDate dataNasc;
        
        Paciente alteracao = new Paciente();
        
        nome = (String) dados.get(0);
        tel =  Integer.parseInt(dados.get(1).toString());
        bairro = (String) dados.get(2);
        cidade = (String) dados.get(3);
        rua = (String) dados.get(4);
        tipoPlano = (String) dados.get(5);
        dataNasc = (LocalDate) dados.get(6);

        alteracao.setNome(nome);
        alteracao.setBairro(bairro);
        alteracao.setCidade(cidade);
        alteracao.setRua(rua);
        alteracao.setTelefone(tel);
        alteracao.setLocalDateNasc(dataNasc);
        alteracao.setTipoPlano(tipoPlano);
        alteracao.setConsultaCadastrada(false);
        alteracao.setId(Integer.parseInt(dados.get(7).toString()));
        
        dao.alterar(alteracao);
    }
        
    public void removerPaciente(Paciente pac){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        dao.excluir(pac.getId(), pac.getClass());
    }
    
    public List<Paciente> consultarPaciente(){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class);
        return paciente;
    }
//    public Paciente consultarUmPaciente(Paciente paciente){
//        GenericDAO<Paciente> dao = new GenericDAO<>();
//        paciente = dao.consultar(paciente.getId(), Paciente.class);
//        return paciente;
//    }
}