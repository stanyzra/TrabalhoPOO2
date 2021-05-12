
package POJO;

import java.time.LocalDate;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne
    private Paciente paciente;
    @Convert(converter = conversor.LocalDateAttributeConverter.class)
    private LocalDate localDateCons;
    private Integer horario;
    private String medico;
    private boolean consultaNormal; //consulta normal se true, retorno se false

    public Consulta() {
    }

    public LocalDate getLocalDateCons() {
        return localDateCons;
    }

    public void setLocalDateCons(LocalDate localDateCons) {
        this.localDateCons = localDateCons;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public boolean isConsultaNormal() {
        return consultaNormal;
    }

    public void setConsultaNormal(boolean consultaNormal) {
        this.consultaNormal = consultaNormal;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }
    
    
    
}
