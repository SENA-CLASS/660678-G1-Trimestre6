package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.DomicilioProveePK;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Municipio;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T09:52:02")
@StaticMetamodel(DomicilioProvee.class)
public class DomicilioProvee_ { 

    public static volatile SingularAttribute<DomicilioProvee, DomicilioProveePK> domicilioProveePK;
    public static volatile SingularAttribute<DomicilioProvee, String> barrio;
    public static volatile SingularAttribute<DomicilioProvee, String> direccion;
    public static volatile SingularAttribute<DomicilioProvee, String> localidad;
    public static volatile SingularAttribute<DomicilioProvee, Proveedor> proveedor;
    public static volatile SingularAttribute<DomicilioProvee, String> correoPostal;
    public static volatile SingularAttribute<DomicilioProvee, String> telefono;
    public static volatile SingularAttribute<DomicilioProvee, Municipio> mUNICIPIOidMUNICIPIO;

}