package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.InventarioComprasPK;
import com.mycompany.mavenproject3.Producto;
import com.mycompany.mavenproject3.Proveedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(InventarioCompras.class)
public class InventarioCompras_ { 

    public static volatile SingularAttribute<InventarioCompras, Date> fechaCompra;
    public static volatile SingularAttribute<InventarioCompras, InventarioComprasPK> inventarioComprasPK;
    public static volatile SingularAttribute<InventarioCompras, String> observaciones;
    public static volatile SingularAttribute<InventarioCompras, Float> preciopormayor;
    public static volatile SingularAttribute<InventarioCompras, Proveedor> proveedor;
    public static volatile SingularAttribute<InventarioCompras, Producto> producto;
    public static volatile SingularAttribute<InventarioCompras, Integer> canProComprado;

}