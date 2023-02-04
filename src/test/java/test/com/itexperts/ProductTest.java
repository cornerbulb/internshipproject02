/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Product;
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
public class ProductTest {
    
   Product pd1;
    Product pd2;
    Product pd3;
    Product pd4;

    public ProductTest() {
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
        pd1 = new Product(4, "Ring", "350", "2");
        pd2 = new Product(5, "Dress", "450", "5");
        pd3 = new Product(23, "Sneaker", "250", "1");
        pd4 = new Product(45, "Jeans", "50", "2");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestProduct() {
            Product p = new Product();
        pd1 = new Product(4, "Ring", "350", "2");
        pd2 = new Product(5, "Dress", "450", "5");
        pd3 = new Product(23, "Sneaker", "250", "1");
        pd4 = new Product(45, "Jeans", "50", "2");

        assertEquals(4, pd1.getId());
        assertEquals("Ring", pd1.getName());
        assertEquals("350", pd1.getPrice());
        assertEquals("2", pd1.getQty());

        assertEquals(5, pd2.getId());
        assertEquals("Dress", pd2.getName());
        assertEquals("450", pd2.getPrice());
        assertEquals("5", pd2.getQty());

        assertEquals(23, pd3.getId());
        assertEquals("Sneaker", pd3.getName());
        assertEquals("250", pd3.getPrice());
        assertEquals("1", pd3.getQty());
        
        
        pd4.setId(45);
        pd4.setName("Jeans");
        pd4.setPrice("50");
        pd4.setQty("2");
        pd4.setDepartmentList(pd3.getDepartmentList());
        pd4.setProductList(pd3.getProductList());

    }

}
