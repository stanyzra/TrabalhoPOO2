package usuario;

import DAO.GenericDAO;
import POJO.Consulta;
import POJO.DadosAdicionais;
import POJO.Paciente;
import POJO.Prontuario;
import java.util.List;

public class Usuario {

    public Usuario() {
        
    }
    
    public void menu() {
        
    }

    public void cadastrarPaciente(Paciente pac){
        
    }
    
    public void atualizarPaciente(Paciente pac){
        
    }
    
    public void removerPaciente(Paciente pac){
        
    }
    
    public void cadastrarDadosPacientes(DadosAdicionais dados){

    }
    
    public void atualizarDadosPaciente(DadosAdicionais dados){

    }
    
    public void removerDadosPaciente(DadosAdicionais dados){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(dados.getIdDadosAdicionais(), dados.getClass());
    }
    
    public void cadastrarProntuario(Prontuario pront){

    }
    
    public void atualizarProntuario(Prontuario pront){
        
    }
    
    public void removerProntuario(Prontuario pront){
        GenericDAO dao = new GenericDAO<>();
        dao.excluir(pront.getIdProntuario(), pront.getClass());
    }
    
    public void gerarRelatorioMedico(){
        
    }

    public void cadastrarConsulta(Consulta cons) {
        
    }
    
    public void atualizarConsulta(Consulta cons) {
        
    }
    
    public void removerConsulta(Consulta cons) {
        
    }
    
    public void gerarRelatorioConsulta(){
        
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
    
    public List<Paciente> consultarPacientes(){
        GenericDAO dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class);
        return paciente;
    }
        
    public Paciente consultarUmPaciente(int id){
        GenericDAO<Paciente> dao = new GenericDAO<>();
        Paciente pac = dao.consultar(id, Paciente.class);
        return pac;
    }
    
    public List<Paciente> consultarPacienteNome(String nome){
        GenericDAO dao = new GenericDAO<>();
        List<Paciente> paciente;
        paciente = dao.consultar(Paciente.class, nome);
        return paciente;
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
    
    public void enviarMensagem(int horario, int telefone, String email){
        
    }
}
