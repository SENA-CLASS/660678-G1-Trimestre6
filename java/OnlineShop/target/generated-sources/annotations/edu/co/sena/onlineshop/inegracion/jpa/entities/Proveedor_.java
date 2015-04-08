package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.DomicilioProvee;
import edu.co.sena.onlineshop.inegracion.jpa.entities.InventarioCompras;
import edu.co.sena.onlineshop.inegracion.jpa.entities.ProveedorPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T23:59:03")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombreProveedor;
    public static volatile SingularAttribute<Proveedor, ProveedorPK> proveedorPK;
    public static volatile SingularAttribute<Proveedor, String> correo;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile CollectionAttribute<Proveedor, InventarioCompras> inventarioComprasCollection;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile SingularAttribute<Proveedor, DomicilioProvee> domicilioProvee;
    public static volatile SingularAttribute<Proveedor, Integer> domicilioIddomicilio;

}