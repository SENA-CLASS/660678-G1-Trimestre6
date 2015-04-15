package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.Departamento;
import edu.co.sena.onlineshop.inegracion.jpa.entities.DomicilioCuentas;
import edu.co.sena.onlineshop.inegracion.jpa.entities.DomicilioProvee;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T09:52:02")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile SingularAttribute<Municipio, Departamento> dEPARTAMENTOidDEPARTAMENTO;
    public static volatile CollectionAttribute<Municipio, DomicilioCuentas> domicilioCuentasCollection;
    public static volatile SingularAttribute<Municipio, Integer> idMUNICIPIO;
    public static volatile CollectionAttribute<Municipio, DomicilioProvee> domicilioProveeCollection;
    public static volatile SingularAttribute<Municipio, String> nombreMunicipio;

}