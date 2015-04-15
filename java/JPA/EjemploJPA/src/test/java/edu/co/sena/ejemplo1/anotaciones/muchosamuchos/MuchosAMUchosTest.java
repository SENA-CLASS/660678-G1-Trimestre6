/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.anotaciones.muchosamuchos;

import edu.co.sena.ejemplo1.relaciones.unoamuchos.Materia3;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernando
 */
public class MuchosAMUchosTest {
    
    public MuchosAMUchosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
    public void insertar(){
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("hernando moreno");
        
        Project projecto1 = new Project();
        projecto1.setId(1);
        projecto1.setName("primer proyecto");
        
        Project projecto2 = new Project();
        projecto1.setId(2);
        projecto1.setName("primer proyecto");
        //cambio en el repositorio
        List<Project> projects = new ArrayList<>();
        projects.add(projecto1);
        projects.add(projecto2);
        
        emp1.setProjects(projects);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemploJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(emp1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    
    }
}
