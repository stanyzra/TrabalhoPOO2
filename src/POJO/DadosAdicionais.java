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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author aleix
 */
@Entity

public class DadosAdicionais {
    //dados adicionais   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDadosAdicionais;
    private boolean fuma;
    private boolean bebe;
    private boolean colesterol;
    private boolean diabete;
    private boolean doencaCard;
    private String cirurgias;
    private String alergias;
    @OneToOne
    private Paciente paciente;

    public DadosAdicionais(){
        
    }

    public int getIdDadosAdicionais() {
        return idDadosAdicionais;
    }

    public void setIdDadosAdicionais(int idDadosAdicionais) {
        this.idDadosAdicionais = idDadosAdicionais;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public boolean isFuma() {
        return fuma;
    }

    public void setFuma(boolean fuma) {
        this.fuma = fuma;
    }

    public boolean isBebe() {
        return bebe;
    }

    public void setBebe(boolean bebe) {
        this.bebe = bebe;
    }

    public boolean isColesterol() {
        return colesterol;
    }

    public void setColesterol(boolean colesterol) {
        this.colesterol = colesterol;
    }

    public boolean isDiabete() {
        return diabete;
    }

    public void setDiabete(boolean diabete) {
        this.diabete = diabete;
    }

    public boolean isDoencaCard() {
        return doencaCard;
    }

    public void setDoencaCard(boolean doençaCard) {
        this.doencaCard = doençaCard;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
}
