/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adasasistemas.pilot.webtest3;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author joseangel.pellicer
 */
public class TestClassNGTest {
    
    public TestClassNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getOne method, of class TestClass.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        TestClass instance = new TestClass();
        String expResult = "";
        String result = instance.getOne();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTwo method, of class TestClass.
     */
    @Test
    public void testGetTwo() {
        System.out.println("getTwo");
        TestClass instance = new TestClass();
        String expResult = "";
        String result = instance.getTwo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
