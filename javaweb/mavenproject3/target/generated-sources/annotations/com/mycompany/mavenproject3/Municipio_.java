package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Departamento;
import com.mycompany.mavenproject3.DomicilioCuentas;
import com.mycompany.mavenproject3.DomicilioProvee;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile SingularAttribute<Municipio, Departamento> dEPARTAMENTOidDEPARTAMENTO;
    public static volatile CollectionAttribute<Municipio, DomicilioCuentas> domicilioCuentasCollection;
    public static volatile SingularAttribute<Municipio, Integer> idMUNICIPIO;
    public static volatile CollectionAttribute<Municipio, DomicilioProvee> domicilioProveeCollection;
    public static volatile SingularAttribute<Municipio, String> nombreMunicipio;

}