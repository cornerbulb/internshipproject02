/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Jewelery;
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
public class JeweleryTest {

    Jewelery j1;
    Jewelery j0;

    public JeweleryTest() {
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
        j1 = new Jewelery("8", 4, "Ring", "350", "2");
        j0 = new Jewelery("5", 9, "bracelet", "90", "3");

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestJewelery() {
        
        Jewelery j = new Jewelery();
        
        j1 = new Jewelery("8", 4, "Ring", "350", "2");
        j0 = new Jewelery("5", 9, "bracelet", "90", "3");

        assertEquals("8", j1.getSize());
        assertEquals(4, j1.getId());
        assertEquals("Ring", j1.getName());
        assertEquals("350", j1.getPrice());
        assertEquals("2", j1.getQty());

        j0.setSize("5");
        j0.setId(9);
        j0.setName("bracelet");
        j0.setPrice("90");
        j0.setQty("3");

    }
}
