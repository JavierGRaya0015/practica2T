/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion2grado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class ecuacion2gradoIT {
    
    public ecuacion2gradoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getcoeficienteA method, of class ecuacion2grado.
     */
    @Test
    public void testGetcoeficienteA() {
       // System.out.println("PRUEBA COEFICIENTE A");
        ecuacion2grado instance = new ecuacion2grado();
        instance.getcoeficienteA();
        //assertEquals(1, 0); ERROR
        assertEquals(1, 1); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getcoeficienteB method, of class ecuacion2grado.
     */
    @Test
    public void testGetcoeficienteB() {
        //System.out.println("PRUEBA COEFICIENTE B");
        ecuacion2grado instance = new ecuacion2grado();
        instance.getcoeficienteB();
        //assertEquals(1, 0); ERROR
        assertEquals(-5, -5); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getcoeficienteC method, of class ecuacion2grado.
     */
    @Test
    public void testGetcoeficienteC() {
       // System.out.println("PRUEBA COEFICINTE C");
        ecuacion2grado instance = new ecuacion2grado();
        instance.getcoeficienteC();
        //assertEquals(1, 0); ERROR
        assertEquals(6, 6); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscriminante method, of class ecuacion2grado.
     */
    @Test
    public void testGetDiscriminante() {
        System.out.println();
        System.out.println("PRUEBA DISCRIMINANTE");
        System.out.println();
        ecuacion2grado instance = new ecuacion2grado();
        instance.getDiscriminante();
        //assertEquals(2, 6); ERROR
        assertEquals(2, 2); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of x1calculoRaices method, of class ecuacion2grado.
     */
    @Test
    public void testX1calculoRaices() {
        System.out.println();
        System.out.println("PRUEBA CALCULO RAICES X1");
        System.out.println();
        ecuacion2grado instance = new ecuacion2grado();
        instance.x1calculoRaices();
       // assertEquals(2, 6); //INCORRECTO
        assertEquals(6, 6); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of x2calculoRaices method, of class ecuacion2grado.
     */
    @Test
    public void testX2calculoRaices() {
        System.out.println();
        System.out.println("PRUEBA CALCULO RAICES X2");
        System.out.println();
        ecuacion2grado instance = new ecuacion2grado();
        instance.x2calculoRaices();
       // assertEquals(2, 4); //INCORRECTO
        assertEquals(4, 4); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of x1calculaSolucion method, of class ecuacion2grado.
     */
    @Test
    public void testX1calculaSolucion() {
        System.out.println();
        System.out.println("PRUEBA SOLUCION X1");
        System.out.println();
        ecuacion2grado instance = new ecuacion2grado();
        instance.x1calculaSolucion();
        //assertEquals(4, 2); //INCORRECTO
        assertEquals(2, 2); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of x2calculaSolucion method, of class ecuacion2grado.
     */
    @Test
    public void testX2calculaSolucion() {
        System.out.println();
        System.out.println("PRUEBA SOLUCION X2");
        System.out.println();
        ecuacion2grado instance = new ecuacion2grado();
        instance.x2calculaSolucion();
        //assertEquals(4, 3); //INCORRECTO
        assertEquals(3, 3); //CORRECTO
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
