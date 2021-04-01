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
import org.junit.jupiter.api.*;
/**
 *
 * @author darry
 */
public class assetsTest {
    
    public assetsTest() {
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
    // Assets inventory equal test
    @Test
    public void testgullag(){
        assets modelnr = new assets(){};
        assertEquals(200,modelnr.gullag(100,100));
        }
    // Assets Identification test
    @Test
    public void testgullagTurbo(){
        assets modelnr = new assets(){};
        assertNotSame(200,modelnr.gullag(100,100));
    }
    // Failing Assets test
    @Test
    public void testgullagDamage(){
        assets modelnr = new assets(){};
        assertEquals(200,modelnr.gullag(100,10));    
    } 
    // Asset timeout test
    @Timeout (60)
    @Test
    public void testgullagPending(){
        assets modelnr = new assets(){};
        assertEquals(200,modelnr.gullag(100,100));    
    } 
    // Disabling test
    @Disabled
    @Test
    public void testgullagBroken(){
        assets modelnr = new assets(){};
        assertEquals(200,modelnr.gullag(100,100));    
    } 
    
    
    }
   
     

