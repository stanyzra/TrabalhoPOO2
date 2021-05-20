package usuario;

import DAO.GenericDAO;
import POJO.Consulta;
import POJO.DadosAdicionais;
import POJO.Paciente;
import POJO.Prontuario;

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
    
    public void enviarMensagem(){
        
    }
}
