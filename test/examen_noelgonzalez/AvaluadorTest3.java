/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_noelgonzalez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author noelg
 */
@RunWith(Parameterized.class)
public class AvaluadorTest3 {
    
    private Avaluador avaluador;
    
    @Parameterized.Parameter(0)
    public Estudiant alumno1;
    
    @Parameterized.Parameter(1)
    public Estudiant alumno2;
    
    @Parameterized.Parameter(2)
    public Estudiant alumno3;
    
    @Parameterized.Parameter(3)
    public Estudiant mejor;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {        
        
        Object[][] data = new Object[][] {
            
            {new Estudiant ("Noel", 12.0, 11.0, 13.0),
             new Estudiant ("Rosa", 10.0, 10.0, 13.0),
             new Estudiant ("Pepe", 18.0, 10.0, 12.0),
             new Estudiant ("Pepe", 18.0, 10.0, 12.0)},
            
            {new Estudiant ("Manuel", 15.0, 12.0, 16.0),
             new Estudiant ("Biel", 15.0, 11.0, 18.0),
             new Estudiant ("Itziar", 18.0, 16.0, 12.0),
             new Estudiant ("Itziar", 18.0, 16.0, 12.0)},
            
            {new Estudiant ("Ana", 17.0, 12.0, 16.0),
             new Estudiant ("Mireia", 18.0, 19.0, 16.0),
             new Estudiant ("Joan", 12.0, 15.0, 14.0),
             new Estudiant ("Mireia", 18.0, 19.0, 16.0)},
            
            {new Estudiant ("Adri", 10.0, 11.0, 13.0),
             new Estudiant ("Fran", 16.0, 20.0, 12.0),
             new Estudiant ("David", 14.0, 13.0, 17.0),
             new Estudiant ("Fran", 16.0, 20.0, 12.0)},
                
            {new Estudiant ("Pablo", 12.0, 15.0, 16.0),
             new Estudiant ("Lucas", 15.0, 10.0, 13.0),
             new Estudiant ("Marc", 12.0, 16.0, 14.0),
             new Estudiant ("Pablo", 12.0, 15.0, 16.0)},
        };
        return Arrays.asList(data);
    }
    
    public AvaluadorTest3() {
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
    }
    
    @After
    public void tearDown() {
        avaluador = null;
    }
    
    //TEST DE LA CLASE MILLOR ESTUDIANT

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     * @throws java.lang.Exception
        
    @Test
    public void testMitjanaSiSupera() throws Exception {
        avaluador = new Avaluador(20,0,10);
        assertEquals(total, avaluador.mitjana(alumno), 0.01);
    }
    */
    
    /**
     * Test of mitjana method, of class Avaluador.
     * @throws java.lang.Exception
    @Test
    public void testMitjana() throws Exception {
        avaluador = new Avaluador(20,0,10);
        assertEquals(total, avaluador.mitjana(alumno), 0.01);
    }
    */
    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() throws Exception {
        Estudiant array[] = new Estudiant[3];
        array[0] = alumno1;
        array[1] = alumno2;
        array[2] = alumno3;
        
        avaluador = new Avaluador(20,0,10);
        assertEquals(mejor, avaluador.millorEstudiantPerNotaMitjana(array));
    }
    
}
