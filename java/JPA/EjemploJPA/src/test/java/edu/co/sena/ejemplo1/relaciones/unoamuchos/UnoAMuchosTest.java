/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.relaciones.unoamuchos;

import edu.co.sena.ejemplo1.relaciones.unoauno.*;
import edu.co.sena.ejemplo1.anotaciones.Estudiante;
import edu.co.sena.ejemplo1.anotaciones.Materia;
import edu.co.sena.ejemplo1.sinrelaciones.unoauno.Estudiante1;
import edu.co.sena.ejemplo1.sinrelaciones.unoauno.Materia1;
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
public class UnoAMuchosTest {
    
    public UnoAMuchosTest() {
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
        
        Materia3 m1 = new Materia3();
        m1.setIdMateria("2");
        m1.setNombre("asdfasdfsdf");
        m1.setDescripcion("sadfsdfasdf");
        
        
        Estudiante3 e1 = new Estudiante3();
        e1.setIdEstudiante("1");
        e1.setNombre("asdfasdfsdf");
        e1.setCorreo("sadfsdfasdf");
        e1.setDireccion("sadfsdfasdf");
        e1.setTelefono("sadfsdfasdf");
        e1.setMateria(m1);
        Estudiante3 e2 = new Estudiante3();
        e2.setIdEstudiante("2");
        e2.setNombre("asdfasdfsdf");
        e2.setCorreo("sadfsdfasdf");
        e2.setDireccion("sadfsdfasdf");
        e2.setTelefono("sadfsdfasdf");
        e2.setMateria(m1);
        
        
        
        
        List<Estudiante3> listado = new ArrayList<>();
        listado.add(e1);
        listado.add(e2);
        m1.setEstudiantes(listado);
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemploJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(m1);
        em.getTransaction().commit();
        em.close();
        emf.close();
        }
    //cambio aca esta el cambio en el git
    @Test
    public void consulta(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemploJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
       // em.getTransaction().begin();
        Materia3 mt = em.find(Materia3.class, "2");
        //em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println(mt.toString());
        for (Estudiante3 listado1 : mt.getEstudiantes()) {
            System.out.println("------"+listado1.toString());
        }
      
    }
}
