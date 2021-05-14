package POJO;

import POJO.Paciente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-14T07:52:36", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Prontuario.class)
public class Prontuario_ { 

    public static volatile SingularAttribute<Prontuario, Paciente> paciente;
    public static volatile SingularAttribute<Prontuario, String> prescricaoTratamento;
    public static volatile SingularAttribute<Prontuario, Integer> Id;
    public static volatile SingularAttribute<Prontuario, String> sintomas;
    public static volatile SingularAttribute<Prontuario, String> diagnosticoDoenca;

}