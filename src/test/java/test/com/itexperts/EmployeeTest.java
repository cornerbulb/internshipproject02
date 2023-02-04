/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Employee;
import com.mycompany.itexpert.nest.EmployeeType;
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
public class EmployeeTest {

    Employee emp1;
    Employee emp2;
    Employee emp3;
    Employee emp4;

    public EmployeeTest() {
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
        emp1 = new Employee(67, "Helen", "David", "556530234", "hel123@gmail.com", EmployeeType.FullTime);

        emp2 = new Employee(36, "Tahir", "Khan", "6303930234", "thrabc@gmail.com", EmployeeType.PartTime);
        emp3 = new Employee(112, "Farwa", "Sohail", "7808969302", "san78@gmail.com", EmployeeType.PartTime);
         emp4 = new Employee(1, "Tania", "Tahiar", "3134567890", "kt34@yahoo.com", EmployeeType.PartTime);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestEmployee() {

         Employee emp = new Employee();
        
        emp1 = new Employee(67, "Helen", "David", "556530234", "hel123@gmail.com", EmployeeType.FullTime);

        emp2 = new Employee(36, "Tahir", "Khan", "6303930234", "thrabc@gmail.com", EmployeeType.PartTime);
        emp3 = new Employee(112, "Farwa", "Sohail", "7808969302", "san78@gmail.com", EmployeeType.PartTime);
        emp4 = new Employee(1, "Tania", "Tahiar", "3134567890", "kt34@yahoo.com", EmployeeType.PartTime);

        assertEquals(67, emp1.getId());
        assertEquals("Helen", emp1.getFirst());
        assertEquals("David", emp1.getLast());
        assertEquals("556530234", emp1.getPhone());
        assertEquals("hel123@gmail.com", emp1.getEmail());
        assertEquals(EmployeeType.FullTime, emp1.getType());

        assertEquals(36, emp2.getId());
        assertEquals("Tahir", emp2.getFirst());
        assertEquals("Khan", emp2.getLast());
        assertEquals("6303930234", emp2.getPhone());
        assertEquals("thrabc@gmail.com", emp2.getEmail());
        assertEquals(EmployeeType.PartTime, emp2.getType());

        assertEquals(112, emp3.getId());
        assertEquals("Farwa", emp3.getFirst());
        assertEquals("Sohail", emp3.getLast());
        assertEquals("7808969302", emp3.getPhone());
        assertEquals("san78@gmail.com", emp3.getEmail());
        assertEquals(EmployeeType.PartTime, emp3.getType());

        emp4 = new Employee(1, "Tania", "Tahiar", "3134567890", "kt34@yahoo.com", EmployeeType.PartTime);

        emp4.setId(1);
        emp4.setFirst("Tania");
        emp4.setLast("Tahiar");
        emp4.setPhone("3134567890");
        emp4.setEmail("kt34@yahoo.com");
        emp4.setType(EmployeeType.PartTime);

    }

}
