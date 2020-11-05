/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_noelgonzalez;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noelg
 */
public class AvaluadorTest {
    
    private Estudiant alumno;
    private Avaluador avaluador;
    private Estudiant array[] = new Estudiant[2];
    private Estudiant mejor = new Estudiant("Noel", 7.0, 5.0, 6.0);
    
    public AvaluadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        alumno = new Estudiant("Noel", 7.0, 5.0, 6.0);
        avaluador = new Avaluador();

        array[0] = new Estudiant("Noel", 7.0, 5.0, 6.0);
        array[1] = new Estudiant("Rosa", 5.0, 5.0, 5.0);
    }
    
    @After
    public void tearDown() {
        alumno = null;
        avaluador = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     * @throws java.lang.Exception
    */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(6.0, avaluador.mitjanaSiSupera(alumno), 0.01);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(6.0, avaluador.mitjana(alumno), 0.01);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     * */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        assertEquals(mejor, avaluador.millorEstudiantPerNotaMitjana(array));
    }
}
