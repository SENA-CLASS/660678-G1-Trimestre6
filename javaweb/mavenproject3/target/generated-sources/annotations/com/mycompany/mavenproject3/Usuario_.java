package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Cuenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, String> correoElectronico;
    public static volatile CollectionAttribute<Usuario, Cuenta> cuentaCollection;
    public static volatile SingularAttribute<Usuario, String> rol;
    public static volatile SingularAttribute<Usuario, String> idusuario;

}