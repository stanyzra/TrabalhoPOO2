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
  
    public void cadastrarPaciente(Paciente pac){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        pac.setConsultaCadastrada(false);
        dao.salvar(pac);
    }
   
    public void atualizarPaciente(Paciente pac){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        dao.alterar(pac);
    }
        
    public void removerPaciente(Paciente pac){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        dao.excluir(pac.getId(), pac.getClass());
    }
    
    public Paciente consultarUmPaciente(int id){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        Paciente pac = dao.consultar(id, Paciente.class);
        return pac;
}
    
    public List<Paciente> consultarPaciente(){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class);
        return paciente;
    }
    
        public List<Paciente> consultarPacienteNome(String nome){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class, nome);
        return paciente;
    }
//    public Paciente consultarUmPaciente(Paciente paciente){
//        GenericDAO<Paciente> dao = new GenericDAO<>();
//        paciente = dao.consultar(paciente.getId(), Paciente.class);
//        return paciente;
//    }
}