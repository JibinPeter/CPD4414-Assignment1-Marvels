/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.marvels;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0662366
 */
public class CPD4414Assignment1MarvelsTest {
    
    public CPD4414Assignment1MarvelsTest() {
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
     * Test of main method, of class CPD4414Assignment1Marvels.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CPD4414Assignment1Marvels.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of stringPower method, of class CPD4414Assignment1Marvels.
     */
//    @Test
//    public void testStringPower() {
//        System.out.println("stringPower");
//        String str = "";
//        int num = 0;
//        String expResult = "";
//        String result = CPD4414Assignment1Marvels.stringPower(str, num);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test 
    public void testEmptyStringShouldReturnEmptyString() {
        String str = "";
        int num = 0;
        String expResult = "";
        String result = CPD4414Assignment1Marvels.stringPower(str, num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLessThanOneShouldReturnNull() {
        String str = null;
        int num = 0;
        String expResult = null;
        String result = CPD4414Assignment1Marvels.stringPower(str, num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndOneShouldReturnString() {
        String str = "Sample";
        int num = 1;
        String expResult = "Sample";
        String result = CPD4414Assignment1Marvels.stringPower(str, num);
        assertEquals(expResult, result);
    }
    
}
