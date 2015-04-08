package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.CarritoCompras;
import edu.co.sena.onlineshop.inegracion.jpa.entities.ItemCarritoPK;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T23:59:03")
@StaticMetamodel(ItemCarrito.class)
public class ItemCarrito_ { 

    public static volatile SingularAttribute<ItemCarrito, Double> valorTotal;
    public static volatile SingularAttribute<ItemCarrito, ItemCarritoPK> itemCarritoPK;
    public static volatile SingularAttribute<ItemCarrito, Integer> cantidad;
    public static volatile SingularAttribute<ItemCarrito, Producto> producto;
    public static volatile SingularAttribute<ItemCarrito, CarritoCompras> carritoCompras;
    public static volatile SingularAttribute<ItemCarrito, Double> valorUnitario;

}