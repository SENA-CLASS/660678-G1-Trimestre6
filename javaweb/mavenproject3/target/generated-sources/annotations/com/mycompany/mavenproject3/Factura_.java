package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Cuenta;
import com.mycompany.mavenproject3.Pago;
import com.mycompany.mavenproject3.Pedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> estado;
    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile SingularAttribute<Factura, Date> fechaFactura;
    public static volatile SingularAttribute<Factura, Cuenta> cuenta;
    public static volatile SingularAttribute<Factura, Pedido> pedido;
    public static volatile SingularAttribute<Factura, String> formaPago;
    public static volatile SingularAttribute<Factura, Pago> pago;

}