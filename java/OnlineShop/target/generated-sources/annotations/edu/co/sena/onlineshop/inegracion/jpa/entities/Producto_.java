package edu.co.sena.onlineshop.inegracion.jpa.entities;

import edu.co.sena.onlineshop.inegracion.jpa.entities.Catalogo;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Categoria;
import edu.co.sena.onlineshop.inegracion.jpa.entities.InventarioCompras;
import edu.co.sena.onlineshop.inegracion.jpa.entities.Item;
import edu.co.sena.onlineshop.inegracion.jpa.entities.ItemCarrito;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T09:52:02")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile CollectionAttribute<Producto, Item> itemCollection;
    public static volatile SingularAttribute<Producto, byte[]> imagen;
    public static volatile CollectionAttribute<Producto, InventarioCompras> inventarioComprasCollection;
    public static volatile SingularAttribute<Producto, String> usuarioUltimaModificacion;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, String> usuarioCreacion;
    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile SingularAttribute<Producto, Categoria> categoriaIdCategoria;
    public static volatile SingularAttribute<Producto, Date> fechaCreacion;
    public static volatile CollectionAttribute<Producto, ItemCarrito> itemCarritoCollection;
    public static volatile SingularAttribute<Producto, String> idProducto;
    public static volatile SingularAttribute<Producto, Float> cantidad;
    public static volatile SingularAttribute<Producto, Catalogo> catalogoIdCatalogo;
    public static volatile SingularAttribute<Producto, Boolean> activo;
    public static volatile SingularAttribute<Producto, Date> fechaUltimaModificacion;

}