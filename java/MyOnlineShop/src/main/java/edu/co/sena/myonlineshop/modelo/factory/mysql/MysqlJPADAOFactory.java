/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.factory.mysql;

import edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.myonlineshop.modelo.factory.DAOAbstractFactory;
import edu.co.sena.myonlineshop.modelo.factory.DAOFactory;

/**
 *
 * @author hernando
 */
public class MysqlJPADAOFactory extends DAOAbstractFactory {

    @Override
    public ICarritoComprasDAO createCarritoComprasDAO() {
        return new CarritoComprasDAOImpl();
    }
    
}
