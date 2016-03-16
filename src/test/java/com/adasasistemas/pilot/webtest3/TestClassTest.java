/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adasasistemas.pilot.webtest3;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author joseangel.pellicer
 */
public class TestClassTest {
    
    public TestClassTest() {
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

    /**
     * Test of getOne method, of class TestClass.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        TestClass instance = new TestClass();
        String expResult = "one";
        String result = instance.getOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getTwo method, of class TestClass.
     */
    @Test
    public void testGetTwo() {
        System.out.println("getTwo");
        TestClass instance = new TestClass();
        String expResult = "two";
        String result = instance.getTwo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
