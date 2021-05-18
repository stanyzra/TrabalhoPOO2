package sistema;

import DAO.GenericDAO;
import POJO.Consulta;
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
        GenericDAO dao = new GenericDAO<>();
        pac.setConsultaCadastrada(false);
        dao.salvar(pac);
    }
   
    public void atualizarPaciente(Paciente pac){
        GenericDAO dao = new GenericDAO<>();
        dao.alterar(pac);
    }
        
    public void removerPaciente(Paciente pac){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(pac.getIdPaciente(), pac.getClass());
    }
    
    public Paciente consultarUmPaciente(int id){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        Paciente pac = dao.consultar(id, Paciente.class);
        return pac;
    }
    
    public List<Paciente> consultarPacientes(){
        GenericDAO dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class);
        return paciente;
    }
    
    public List<Paciente> consultarPacienteNome(String nome){
        GenericDAO dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class, nome);
        return paciente;
    }
    
    public void cadastrarConsulta(Consulta cons){
        GenericDAO dao = new GenericDAO();
        dao.salvar(cons);
    }
    
    public void atualizarConsulta(Consulta cons){
        GenericDAO dao = new GenericDAO<>();
        dao.alterar(cons);
    }
    
    public void removerConsulta(Consulta cons){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(cons.getIdConsulta(), cons.getClass());
    }
    
    public List<Consulta> consultarConsultas(){
        GenericDAO dao = new GenericDAO<>();
        List<Consulta> consulta;
        consulta = dao.consultar(Consulta.class);
        return consulta;
    }
    public Consulta consultarUmaConsulta(int id){
        GenericDAO<Consulta> dao = new GenericDAO<>();
        Consulta cons = dao.consultar(id, Consulta.class);
        return cons;
    }
//    public Paciente consultarUmPaciente(Paciente paciente){
//        GenericDAO<Paciente> dao = new GenericDAO<>();
//        paciente = dao.consultar(paciente.getId(), Paciente.class);
//        return paciente;
//    }
}