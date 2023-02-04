/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.EmployeeType;
import com.mycompany.itexpert.nest.PartTime;
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
public class PartTimeTest {

    PartTime p1;
    PartTime p2;
    PartTime p3;

    public PartTimeTest() {
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
        p1 = new PartTime(789, 36, "Tahir", "Khan", "6303930234", "thrabc@gmail.com", EmployeeType.PartTime);
        p2 = new PartTime(500, 112, "Farwa", "Sohail", "7808969302", "san78@gmail.com", EmployeeType.PartTime);
         p3 = new PartTime(15, 6, "Rafia", "Khn", "23456789", "rag3@live.com", EmployeeType.PartTime);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestPartTime() {
        
       PartTime p = new PartTime();
         
        p1 = new PartTime(789, 36, "Tahir", "Khan", "6303930234", "thrabc@gmail.com", EmployeeType.PartTime);
        p2 = new PartTime(500, 112, "Farwa", "Sohail", "7808969302", "san78@gmail.com", EmployeeType.PartTime);
         p3 = new PartTime(15, 6, "Rafia", "Khn", "23456789", "rag3@live.com", EmployeeType.PartTime);

        assertEquals(789f, p1.getHourlypay());
        assertEquals(36, p1.getId());
        assertEquals("Tahir", p1.getFirst());
        assertEquals("Khan", p1.getLast());
        assertEquals("6303930234", p1.getPhone());
        assertEquals("thrabc@gmail.com", p1.getEmail());
        assertEquals(EmployeeType.PartTime, p1.getType());

        assertEquals(500f, p2.getHourlypay());
        assertEquals(112, p2.getId());
        assertEquals("Farwa", p2.getFirst());
        assertEquals("Sohail", p2.getLast());
        assertEquals("7808969302", p2.getPhone());
        assertEquals("san78@gmail.com", p2.getEmail());
        assertEquals(EmployeeType.PartTime, p2.getType());

        p3 = new PartTime(15, 6, "Rafia", "Khn", "23456789", "rag3@live.com", EmployeeType.PartTime);

        p3.setHourlypay(15);
        p3.setId(6);
        p3.setFirst("Rafia");
        p3.setLast("khn");
        p3.setEmail("rag3@live.com");
        p3.setPhone("23456789");

    }

}
