package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.Cuenta;
import edu.co.sena.onlineshop.inegracion.jpa.entities.DomicilioCuentasPK;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Municipio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-10T11:41:39")
@StaticMetamodel(DomicilioCuentas.class)
public class DomicilioCuentas_ { 

    public static volatile SingularAttribute<DomicilioCuentas, String> barrio;
    public static volatile SingularAttribute<DomicilioCuentas, DomicilioCuentasPK> domicilioCuentasPK;
    public static volatile SingularAttribute<DomicilioCuentas, String> direccion;
    public static volatile SingularAttribute<DomicilioCuentas, Cuenta> cuenta;
    public static volatile SingularAttribute<DomicilioCuentas, String> localidad;
    public static volatile SingularAttribute<DomicilioCuentas, String> correoPostal;
    public static volatile SingularAttribute<DomicilioCuentas, String> telefono;
    public static volatile SingularAttribute<DomicilioCuentas, Municipio> mUNICIPIOidMUNICIPIO;

}