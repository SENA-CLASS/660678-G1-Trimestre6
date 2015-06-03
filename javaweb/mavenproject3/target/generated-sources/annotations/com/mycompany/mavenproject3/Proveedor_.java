package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.DomicilioProvee;
import com.mycompany.mavenproject3.InventarioCompras;
import com.mycompany.mavenproject3.ProveedorPK;
import com.mycompany.mavenproject3.TipoDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombreProveedor;
    public static volatile SingularAttribute<Proveedor, TipoDocumento> tipoDocumento;
    public static volatile SingularAttribute<Proveedor, ProveedorPK> proveedorPK;
    public static volatile SingularAttribute<Proveedor, String> correo;
    public static volatile CollectionAttribute<Proveedor, InventarioCompras> inventarioComprasCollection;
    public static volatile SingularAttribute<Proveedor, DomicilioProvee> domicilioProvee;

}