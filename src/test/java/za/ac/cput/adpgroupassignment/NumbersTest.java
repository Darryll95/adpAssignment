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

/**
 *
 * @author User
 */
public class NumbersTest {
    private int num1;
    private int num2;
    private int num3;
    
 
    
    @BeforeEach
    public void setUp() {
         
    }
    
    @Test 
    public void testIdentity(){
    assertSame(num1,num3);
    }
    
    @Test
    public void testEquality() {
assertEquals(num1,num3);
}
    @Test
    public void testfail(){
    fail();
    }
            
            
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
