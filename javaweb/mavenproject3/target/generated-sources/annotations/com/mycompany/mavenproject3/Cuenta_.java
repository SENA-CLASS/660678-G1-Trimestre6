package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.CuentaPK;
import com.mycompany.mavenproject3.DomicilioCuentas;
import com.mycompany.mavenproject3.Factura;
import com.mycompany.mavenproject3.TipoDocumento;
import com.mycompany.mavenproject3.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, TipoDocumento> tipoDocumento;
    public static volatile SingularAttribute<Cuenta, String> segundoNombre;
    public static volatile SingularAttribute<Cuenta, DomicilioCuentas> domicilioCuentas;
    public static volatile SingularAttribute<Cuenta, String> primerNombre;
    public static volatile SingularAttribute<Cuenta, String> primerApellido;
    public static volatile SingularAttribute<Cuenta, CuentaPK> cuentaPK;
    public static volatile SingularAttribute<Cuenta, String> segundoApellido;
    public static volatile SingularAttribute<Cuenta, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<Cuenta, String> usuario;
    public static volatile CollectionAttribute<Cuenta, Factura> facturaCollection;

}