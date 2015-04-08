package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.InventarioComprasPK;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Producto;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T23:59:03")
@StaticMetamodel(InventarioCompras.class)
public class InventarioCompras_ { 

    public static volatile SingularAttribute<InventarioCompras, String> fechaCompra;
    public static volatile SingularAttribute<InventarioCompras, InventarioComprasPK> inventarioComprasPK;
    public static volatile SingularAttribute<InventarioCompras, Proveedor> proveedor;
    public static volatile SingularAttribute<InventarioCompras, Producto> producto;
    public static volatile SingularAttribute<InventarioCompras, Integer> canProComprado;

}