package sistema;

import DAO.GenericDAO;
import POJO.Consulta;
import POJO.DadosAdicionais;
import POJO.Paciente;
import POJO.Prontuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
       
    public List<Paciente> consultarPaciente(){
        GenericDAO dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class);
        return paciente;
    }
    
    public void removerProntuario(Prontuario pront){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(pront.getIdProntuario(), pront.getClass());
    }
    
    public void gerarRelatorioMedico(Paciente pac){
        //kk o que coloca aqui...
    }

    public List<DadosAdicionais> consultarDadosAdicionais(){
        GenericDAO dao = new GenericDAO<>();
        List<DadosAdicionais> dadosAdicionais;
        dadosAdicionais = dao.consultar(DadosAdicionais.class);
        return dadosAdicionais;
    }
    public DadosAdicionais consultarUmDado(int id){
        GenericDAO<DadosAdicionais> dao = new GenericDAO<>();
        DadosAdicionais dados = dao.consultar(id, DadosAdicionais.class);
        return dados;
    }
    
    public List<Prontuario> consultarProntuarios(){
        GenericDAO dao = new GenericDAO<>();
        List<Prontuario> prontuario;
        prontuario = dao.consultar(Prontuario.class);
        return prontuario;
    }
    
    public Prontuario consultarUmProntuario(int id){
        GenericDAO<Prontuario> dao = new GenericDAO<>();
        Prontuario pront = dao.consultar(id, Prontuario.class);
        return pront;
    }
}