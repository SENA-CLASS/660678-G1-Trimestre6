package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.ItemCarrito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(CarritoCompras.class)
public class CarritoCompras_ { 

    public static volatile SingularAttribute<CarritoCompras, String> idCarrito;
    public static volatile SingularAttribute<CarritoCompras, Double> total;
    public static volatile SingularAttribute<CarritoCompras, Double> subtotal;
    public static volatile SingularAttribute<CarritoCompras, Double> impuestos;
    public static volatile CollectionAttribute<CarritoCompras, ItemCarrito> itemCarritoCollection;

}