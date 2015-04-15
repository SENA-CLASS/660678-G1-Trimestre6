package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.ItemCarrito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T09:52:02")
@StaticMetamodel(CarritoCompras.class)
public class CarritoCompras_ { 

    public static volatile SingularAttribute<CarritoCompras, String> idCarrito;
    public static volatile SingularAttribute<CarritoCompras, Double> total;
    public static volatile SingularAttribute<CarritoCompras, Double> subtotal;
    public static volatile SingularAttribute<CarritoCompras, Double> impuestos;
    public static volatile CollectionAttribute<CarritoCompras, ItemCarrito> itemCarritoCollection;

}