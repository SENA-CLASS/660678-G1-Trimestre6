package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Cuenta;
import com.mycompany.mavenproject3.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile SingularAttribute<TipoDocumento, String> descripcion;
    public static volatile SingularAttribute<TipoDocumento, String> tipoDocumento;
    public static volatile CollectionAttribute<TipoDocumento, Proveedor> proveedorCollection;
    public static volatile CollectionAttribute<TipoDocumento, Cuenta> cuentaCollection;

}