package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.DomicilioProveePK;
import com.mycompany.mavenproject3.Municipio;
import com.mycompany.mavenproject3.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
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