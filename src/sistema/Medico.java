package sistema;

import DAO.GenericDAO;
import POJO.DadosAdicionais;
import POJO.Paciente;
import POJO.Prontuario;

/**
 *
 * @author diass
 */
public class Medico extends usuario.Usuario{
    
    public Medico(){
    }
    
    public void cadastrarDadosPacientes(DadosAdicionais dados){
        GenericDAO dao = new GenericDAO<>();
        dao.salvar(dados);
    }
    
    public void atualizarDadosPaciente(DadosAdicionais dados){
        GenericDAO dao = new GenericDAO<>();
        dao.alterar(dados);
    }
    
    public void atualizarPaciente(Paciente pac){
        GenericDAO dao = new GenericDAO<>();
        dao.alterar(pac);
    }
    
    public void removerDadosPaciente(DadosAdicionais dados){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(dados.getIdDadosAdicionais(), dados.getClass());
    }
    
    public void cadastrarProntuario(Prontuario pront){
        GenericDAO dao = new GenericDAO<>();
        dao.salvar(pront);
    }
    
    public void atualizarProntuario(Prontuario pront){
        GenericDAO dao = new GenericDAO<>();
        dao.alterar(pront);
    }
       
    public void removerProntuario(Prontuario pront){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(pront.getIdProntuario(), pront.getClass());
    }
    
}