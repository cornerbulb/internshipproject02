/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Department;
import com.mycompany.itexpert.nest.ProductType;
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
public class DepartmentTest {

    Department dept1;
    Department dept2;
    Department dept3;
    Department dept4;
    Department dept5;
    Department dept6;

    public DepartmentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        dept1 = new Department(20, "Women", ProductType.Clothing);
        dept2 = new Department(15, "Men", ProductType.Shoes);
        dept3 = new Department(15, "Girls", ProductType.Jewelery);
        dept4 = new Department(3, "Boys", ProductType.Shoes);
        dept5 = new Department(4, "kids", ProductType.Clothing);
        dept6 = new Department(5, "ladies", ProductType.Jewelery);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestDepartment() {
        Department dept = new Department();
        
        dept1 = new Department(20, "Women", ProductType.Clothing);
        dept2 = new Department(15, "Men", ProductType.Shoes);
        dept3 = new Department(98, "Girls", ProductType.Jewelery);
        dept4 = new Department(3, "Boys", ProductType.Shoes);
        dept5 = new Department(4, "kids", ProductType.Clothing);
        dept6 = new Department(5, "ladies", ProductType.Jewelery);

        assertEquals(20, dept1.getId());
        assertEquals("Women", dept1.getName());
        assertEquals(ProductType.Clothing, dept1.getType());

        assertEquals(15, dept2.getId());
        assertEquals("Men", dept2.getName());
        assertEquals(ProductType.Shoes, dept2.getType());

        assertEquals(98, dept3.getId());
        assertEquals("Girls", dept3.getName());
        assertEquals(ProductType.Jewelery, dept3.getType());

        dept4.setId(3);
        dept4.setName("Boys");
        dept4.setType(ProductType.Shoes);
        dept4.setDepartmentList(dept1.getDepartmentList());
        dept4.setEmployeeList(dept1.getEmployeeList());
        

        dept5.setId(4);
        dept5.setName("kids");
        dept5.setType(ProductType.Clothing);
        dept5.setDepartmentList(dept2.getDepartmentList());
        dept5.setEmployeeList(dept2.getEmployeeList()); 

        dept6.setId(5);
        dept6.setName("ladies");
        dept6.setType(ProductType.Jewelery);
        dept6.setDepartmentList(dept3.getDepartmentList());
        dept6.setEmployeeList(dept3.getEmployeeList());
        
        

    }

}
