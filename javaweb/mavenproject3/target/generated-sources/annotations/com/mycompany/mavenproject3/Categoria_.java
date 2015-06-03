package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Categoria;
import com.mycompany.mavenproject3.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, Categoria> categoriaIdCategoria;
    public static volatile CollectionAttribute<Categoria, Categoria> categoriaCollection;
    public static volatile CollectionAttribute<Categoria, Producto> productoCollection;
    public static volatile SingularAttribute<Categoria, Integer> idCategoria;
    public static volatile SingularAttribute<Categoria, String> nombre;
    public static volatile SingularAttribute<Categoria, Boolean> activa;

}