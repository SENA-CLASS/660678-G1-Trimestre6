package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.Factura;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T09:52:02")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Double> total;
    public static volatile SingularAttribute<Pedido, Factura> factura;
    public static volatile CollectionAttribute<Pedido, Item> itemCollection;
    public static volatile SingularAttribute<Pedido, Double> subtotal;
    public static volatile SingularAttribute<Pedido, Double> impuestos;
    public static volatile SingularAttribute<Pedido, Integer> facturaIdFactura;

}