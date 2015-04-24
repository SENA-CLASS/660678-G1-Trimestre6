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
    
    public CarritoCompras findByIdCarrito(String idCarrito);
    
    public List<CarritoCompras> findByAll();
    public List<CarritoCompras> findByTotal(double total);
    public List<CarritoCompras> findBySubtotal(double subtotal);
    public List<CarritoCompras> findByImpuestos(double impuesto);
}
