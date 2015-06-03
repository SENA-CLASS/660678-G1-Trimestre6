package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Factura;
import com.mycompany.mavenproject3.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Double> total;
    public static volatile SingularAttribute<Pedido, Factura> factura;
    public static volatile CollectionAttribute<Pedido, Item> itemCollection;
    public static volatile SingularAttribute<Pedido, Double> subtotal;
    public static volatile SingularAttribute<Pedido, Double> impuestos;
    public static volatile SingularAttribute<Pedido, Integer> facturaIdFactura;

}