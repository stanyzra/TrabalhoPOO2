/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.time.LocalDate;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 
@Entity
public class Paciente {
    //dados de identificação
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idPaciente;
    private String nome;
    @Convert(converter = conversor.LocalDateAttributeConverter.class)
    private LocalDate localDateNasc;
    private String bairro;
    private String cidade;
    private String rua;
    private String email;
    private int telefone;
    @OneToOne
    private Consulta consulta;
    @OneToOne
    private DadosAdicionais dadosAdicionais;
    @OneToOne
    private Prontuario prontuario;
    private String tipoPlano;
    private boolean consultaCadastrada, dadosAdicionaisCadastrado, prontuarioCadastrado; //convenio

    public Paciente() {
        
    }

    public int getIdPaciente() {
        return idPaciente;
    }
    
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Consulta getConsulta() {
        return consulta;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public boolean isConsultaCadastrada() {
        return consultaCadastrada;
    }

    public void setConsultaCadastrada(boolean consultaCadastrada) {
        this.consultaCadastrada = consultaCadastrada;
    }
    
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDate getLocalDateNasc() {
        return localDateNasc;
    }

    public boolean isDadosAdicionaisCadastrado() {
        return dadosAdicionaisCadastrado;
    }

    public void setDadosAdicionaisCadastrado(boolean dadosAdicionaisCadastrado) {
        this.dadosAdicionaisCadastrado = dadosAdicionaisCadastrado;
    }

    public DadosAdicionais getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(DadosAdicionais dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
        
    public boolean isProntuarioCadastrado(){
        return prontuarioCadastrado;
    }
    
    public void setProntuarioCadastrado(boolean prontuarioCadastrado) {
        this.prontuarioCadastrado = prontuarioCadastrado;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
    
    public void setProntuario(Prontuario prontuario){
        this.prontuario = prontuario;
    }

    public void setLocalDateNasc(LocalDate localDateNasc) {
        this.localDateNasc = localDateNasc;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
