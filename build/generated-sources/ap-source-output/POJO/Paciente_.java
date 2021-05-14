package POJO;

import POJO.Consulta;
import POJO.DadosAdicionais;
import POJO.Prontuario;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-14T15:09:47", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> cidade;
    public static volatile SingularAttribute<Paciente, Integer> telefone;
    public static volatile SingularAttribute<Paciente, Prontuario> prontuario;
    public static volatile SingularAttribute<Paciente, Boolean> dadosAdicionaisCadastrado;
    public static volatile SingularAttribute<Paciente, String> bairro;
    public static volatile SingularAttribute<Paciente, String> tipoPlano;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile SingularAttribute<Paciente, Boolean> prontuarioCadastrado;
    public static volatile SingularAttribute<Paciente, Integer> idPaciente;
    public static volatile SingularAttribute<Paciente, Boolean> consultaCadastrada;
    public static volatile SingularAttribute<Paciente, LocalDate> localDateNasc;
    public static volatile SingularAttribute<Paciente, DadosAdicionais> dadosAdicionais;
    public static volatile SingularAttribute<Paciente, Consulta> consulta;
    public static volatile SingularAttribute<Paciente, String> rua;

}