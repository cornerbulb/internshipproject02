/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.EmployeeType;
import com.mycompany.itexpert.nest.FullTime;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author newve
 */
public class FullTimeTest {
    
    FullTime ft1;
    FullTime ft2;
    
    public FullTimeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        ft1 = new FullTime(8000, 67, "Helen", "David", "556530234", "hel123@gmail.com", EmployeeType.FullTime);
        ft2 = new FullTime(5000.0f, 81, "Amin", "Saeed", "657849733", "saee@yahoo.com", EmployeeType.FullTime);        
        
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void TestFullTime() {
        
         FullTime ft = new FullTime();
        
        ft1 = new FullTime(8000, 67, "Helen", "David", "556530234", "hel123@gmail.com", EmployeeType.FullTime);
        ft2 = new FullTime(5000.0f, 81, "Amin", "Saeed", "657849733", "saee@yahoo.com", EmployeeType.FullTime);        
        
        assertEquals(8000f, ft1.getSalary());
        assertEquals(67, ft1.getId());
        assertEquals("Helen", ft1.getFirst());
        assertEquals("David", ft1.getLast());
        assertEquals("556530234", ft1.getPhone());
        assertEquals("hel123@gmail.com", ft1.getEmail());
        assertEquals(EmployeeType.FullTime, ft1.getType());
        
        ft2 = new FullTime(5000.0f, 81, "Amin", "Saeed", "657849733", "saee@yahoo.com", EmployeeType.FullTime);        
        
        ft2.setSalary(5000.0f);
        ft2.setId(81);
        ft2.setFirst("Amin");
        ft2.setLast("Saeed");
        ft2.setEmail("saee@yahoo.com");
        ft2.setPhone("657849733");
        ft2.setType(EmployeeType.FullTime);
        
    }
    
}
