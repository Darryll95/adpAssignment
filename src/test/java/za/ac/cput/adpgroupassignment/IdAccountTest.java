
package za.ac.cput.adpgroupassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author anathi mhlom 220006695
 * 
 * Testing of Id Account domain
 */
public class IdAccountTest {
    private IdAccount account1;
    private IdAccount account2;
    private IdAccount account3;
    private IdAccount account4;
    
    public IdAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Method before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Method after class");
    }
    
    @Before
    public void setUp() {
        account1 = new IdAccount();
        account2 = new IdAccount();
        account3 = account2;
        account4 = account1;
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testEquality() {
        assertEquals(account1, account4);
    }
    
    @Test
    public void testIdentity() {
        assertSame(account2, account3);
    }
    
    //Test of getSurname
    @Test
    public void testGetSurname() {
        System.out.println("Get Surname");
        IdAccount account1 = new IdAccount();
        String expResult = "";
        String result = account1.getSurname();   
    }
    
    //Test of setSurname
    @Test
    public void testSetSurname() {
        System.out.println("Set Surname");
        String Surname = "";
        IdAccount account1 = new IdAccount();
        account1.setSurname("");    
    }
    
    //Test of getNames
    @Test 
    @Ignore
    public void testGetNames() {
        System.out.println("Get Names");
        IdAccount account1 = new IdAccount();
        String expResult = "";
        String result = account1.getNames(); 
    }
    
    //Test of setNames
    @Test
    public void testSetNames() {
        System.out.println("Set Names");
        String Names = "";
        IdAccount account1 = new IdAccount();
        account1.setNames("");
        fail("This test case is a prototype");    
    }
    
    //Test of getStatus
    @Test
    @Timeout(10)
    public void testGetStatus() {
        System.out.println("Get Status");
        IdAccount account1 = new IdAccount();
        String expResult = "";
        String result = account1.getStatus();  
    }
    
    //Test of setStatus
    @Test
    public void testSetStatus() {
        System.out.println("Set Status");
        String Status = "";
        IdAccount account1 = new IdAccount();
        account1.setStatus("");    
    }
}
    
