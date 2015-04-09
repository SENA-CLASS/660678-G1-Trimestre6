/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.relaciones.unoauno;

import edu.co.sena.ejemplo1.anotaciones.Estudiante;
import edu.co.sena.ejemplo1.anotaciones.Materia;
import edu.co.sena.ejemplo1.sinrelaciones.unoauno.Estudiante1;
import edu.co.sena.ejemplo1.sinrelaciones.unoauno.Materia1;
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
public class UnoAUnoTest {
    
    public UnoAUnoTest() {
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
        Estudiante2 e1 = new Estudiante2();
        e1.setIdEstudiante("1");
        e1.setNombre("asdfasdfsdf");
        e1.setCorreo("sadfsdfasdf");
        e1.setDireccion("sadfsdfasdf");
        e1.setTelefono("sadfsdfasdf");
        
        
        Materia2 m1 = new Materia2();
        m1.setIdMateria("2");
        m1.setNombre("asdfasdfsdf");
        m1.setDescripcion("sadfsdfasdf");
        e1.setMateria(m1);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemploJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(e1);
        em.getTransaction().commit();
        em.close();
        emf.close();
        }
    
    @Test
    public void consulta(){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemploJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Estudiante2 et = em.find(Materia2.class, "2").getEstudiante();
        Materia2 mt = em.find(Estudiante2.class, "1").getMateria();
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        System.out.println(et.toString());
        System.out.println(mt.toString());

    }
}
