package sistema;

import DAO.GenericDAO;
import POJO.Consulta;
import POJO.Paciente;
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
        pac.setDadosAdicionaisCadastrado(false);
        pac.setProntuarioCadastrado(false);
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

}