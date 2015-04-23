/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces;

import edu.co.sena.myonlineshop.modelo.jpa.entities.CarritoCompras;
import java.util.List;

/**
 *
 * @author hernando
 */
public interface ICarritoComprasDAO {
    
    public void insert(CarritoCompras entity);
    public void update(CarritoCompras entity);
    public void delete(CarritoCompras entity);
    
    public CarritoCompras findByIdCarrito();
    
    public List<CarritoCompras> findByAll();
    public List<CarritoCompras> findByTotal(Object total);
    public List<CarritoCompras> findBySubtotal(Object subtotal);
    public List<CarritoCompras> findByImpuestos(Object impuesto);
}
