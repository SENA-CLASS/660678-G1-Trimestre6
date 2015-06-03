package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.Catalogo;
import com.mycompany.mavenproject3.Categoria;
import com.mycompany.mavenproject3.InventarioCompras;
import com.mycompany.mavenproject3.Item;
import com.mycompany.mavenproject3.ItemCarrito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-31T01:36:04")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Categoria> categoriaIdCategoria;
    public static volatile SingularAttribute<Producto, Double> precioDetal;
    public static volatile CollectionAttribute<Producto, Item> itemCollection;
    public static volatile SingularAttribute<Producto, byte[]> imagen;
    public static volatile CollectionAttribute<Producto, ItemCarrito> itemCarritoCollection;
    public static volatile CollectionAttribute<Producto, InventarioCompras> inventarioComprasCollection;
    public static volatile SingularAttribute<Producto, String> idProducto;
    public static volatile SingularAttribute<Producto, Float> cantidad;
    public static volatile SingularAttribute<Producto, Catalogo> catalogoIdCatalogo;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Boolean> activo;

}