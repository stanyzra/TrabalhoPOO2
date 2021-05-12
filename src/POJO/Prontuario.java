/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author aleix
 */
@Entity
public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String sintomas;
    private String diagnosticoDoenca;
    private String prescricaoTratamento;
    @OneToOne
    private Paciente paciente;

    public Prontuario() {
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnosticoDoenca() {
        return diagnosticoDoenca;
    }

    public void setDiagnosticoDoenca(String diagnosticoDoenca) {
        this.diagnosticoDoenca = diagnosticoDoenca;
    }

    public String getPrescricaoTratamento() {
        return prescricaoTratamento;
    }

    public void setPrescricaoTratamento(String prescricaoTratamento) {
        this.prescricaoTratamento = prescricaoTratamento;
    }
    
    
}
