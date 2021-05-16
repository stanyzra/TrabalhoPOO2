package POJO;

import POJO.Paciente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-15T17:06:50", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(DadosAdicionais.class)
public class DadosAdicionais_ { 

    public static volatile SingularAttribute<DadosAdicionais, Boolean> diabete;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> fuma;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> doencaCard;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> colesterol;
    public static volatile SingularAttribute<DadosAdicionais, Paciente> paciente;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> bebe;
    public static volatile SingularAttribute<DadosAdicionais, Integer> idDadosAdicionais;
    public static volatile SingularAttribute<DadosAdicionais, String> cirurgias;
    public static volatile SingularAttribute<DadosAdicionais, String> alergias;

}