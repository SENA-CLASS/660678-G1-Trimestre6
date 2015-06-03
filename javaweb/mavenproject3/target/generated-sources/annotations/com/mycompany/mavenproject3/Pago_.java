package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Factura> factura;
    public static volatile SingularAttribute<Pago, String> numeCuenta;
    public static volatile SingularAttribute<Pago, String> tipoPago;
    public static volatile SingularAttribute<Pago, Integer> facturaIdFactura;
    public static volatile SingularAttribute<Pago, Integer> numeroTargeta;

}