/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.factory;

import edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces.ICarritoComprasDAO;

/**
 *
 * @author hernando
 */
public interface DAOFactory {
    public ICarritoComprasDAO createCarritoComprasDAO();
}
