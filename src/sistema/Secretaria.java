package sistema;

import DAO.GenericDAO;
import POJO.Consulta;
import POJO.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aleix
 */
public class Secretaria extends usuario.Usuario {
    private ArrayList<Paciente> pacientes;
    private ArrayList<Consulta> consultas;
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public Secretaria() {
        this.pacientes = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.emf = Persistence.createEntityManagerFactory("trabalho2PU");
        this.em = emf.createEntityManager();
    }
    
    public Secretaria(ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas){
        this.pacientes = pacientes;
        this.consultas = consultas;
        this.emf = Persistence.createEntityManagerFactory("trabalho2PU");
        this.em = emf.createEntityManager();
    }
  
    public void cadastrarPaciente(ArrayList dados){
        
        int tel;
        String nome, bairro, cidade, rua, tipoPlano; 
        LocalDate dataNasc;
        
        Paciente pacienteNovo = new Paciente();
        GenericDAO dao = new GenericDAO();
        
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
}