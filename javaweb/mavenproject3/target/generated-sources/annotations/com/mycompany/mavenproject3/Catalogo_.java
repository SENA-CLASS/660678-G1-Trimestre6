package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Catalogo.class)
public class Catalogo_ { 

    public static volatile SingularAttribute<Catalogo, Integer> idCatalogo;
    public static volatile SingularAttribute<Catalogo, String> nombreCatalogo;
    public static volatile CollectionAttribute<Catalogo, Producto> productoCollection;
    public static volatile SingularAttribute<Catalogo, String> decripcion;

}