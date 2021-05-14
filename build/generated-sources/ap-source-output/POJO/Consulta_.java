package POJO;

import POJO.Paciente;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-14T07:52:36", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Integer> horario;
    public static volatile SingularAttribute<Consulta, LocalDate> localDateCons;
    public static volatile SingularAttribute<Consulta, Paciente> paciente;
    public static volatile SingularAttribute<Consulta, String> medico;
    public static volatile SingularAttribute<Consulta, Boolean> consultaNormal;
    public static volatile SingularAttribute<Consulta, Integer> Id;

}