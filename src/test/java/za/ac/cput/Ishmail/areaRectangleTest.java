/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.Ishmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author mac
 */
public class areaRectangleTest {
    
    private areaRectangle arearectangle;
    
    public areaRectangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testMultiplication() {
        
        int results = arearectangle.multiplication(10, 7);
        assertEquals(70 ,results);
    }
     @Test 
    public void testIdentity() {
        assertSame(arearectangle, arearectangle);
    }
    @Test
    public void testFail() {
        
        int results = arearectangle.multiplication(10, 7);
        assertEquals(70 ,results);
        fail("You will fail");
        
    }
    @Test
    @Timeout(10)
    public void testTimeout() {
        
        int results = arearectangle.multiplication(10, 7);
        assertEquals(70 ,results);
    }
    
}
