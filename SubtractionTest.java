/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroupassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Nonzwakazi Mgxaji
 * 
 * This test class is to demonstrate TDD on Subtraction class
 */
public class SubtractionTest {

    private static int subtract(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public SubtractionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        SubtractionTest SubtractionTest = new SubtractionTest();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of subtraction method, of class Subtraction.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int x = 0;
        int y = 0;
        Subtraction instance = new Subtraction();
        int expResult = 0;
        int result = instance.subtraction(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void objectIdentity(){
        int answer = SubtractionTest.subtract(10,5);
        assertEquals(answer,5);
    }
    
    @Test
    public void objectEquality() {
        int answer = SubtractionTest.subtract(5,3);
        assertSame(answer,2);
    }
    
     @Test
    public void failingTest() {
        int answer = SubtractionTest.subtract(15,5);
        assertSame(answer,2);
    }
    @Disabled()
     @Test
    public void testDisable() {
        System.out.println("Test disabled");
    
}
    
    
    
}
