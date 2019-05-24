package com.initailizacionExample.initializacionExample.Example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class InitalazacionTestTest {
    @BeforeClass
    public static void antesdeMiClase(){
        System.out.println("antes de mi clase");
    }
    @AfterClass
    public static void despuesdeMiClase(){
        System.out.println("Despues de mi clase");
    }


    @Before
    public void antesdemiTest() throws Exception {
        System.out.println("Antes de mi test");
    }

    @After
    public void despuesdemiTest() throws Exception {
        System.out.println("Despues de mi test");
    }

    @Before
    public void PrimerPrueba() throws Exception {
        System.out.println("Primer Prueba");
    }

    @After
    public void SegundaPrueba() throws Exception {
        System.out.println("Segunda Prueba");
    }

}