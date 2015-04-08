/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.onlineshop.inegracion.jpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.co.sena.onlineshop.inegracion.jpa.util.EntityManagerHelper;

/**
 *
 * @author hernando
 */
public class CatalogoTestJPA {
    
    Catalogo catalogo;
    EntityManager em;
    
    
    public CatalogoTestJPA() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        catalogo= new Catalogo();
        catalogo.setDecripcion("catalogo 1 de prueba");
        catalogo.setNombreCatalogo("catalogo 1 prueba");
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void insertarCatalogo(){
        
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(catalogo);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
    }
}
