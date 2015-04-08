package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.CuentaPK;
import edu.co.sena.onlineshop.inegracion.jpa.entities.DomicilioCuentas;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Factura;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T23:59:03")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

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