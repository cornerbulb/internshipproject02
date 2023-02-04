/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Clothing;
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
public class ClothingTest {

    Clothing clo;
    Clothing clo1;

    public ClothingTest() {
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
        clo = new Clothing("L", 5, "Dress", "450", "5");
        clo1 = new Clothing("M", 5, "skirt", "500", "10");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestClothing() {
        Clothing clo = new Clothing();
        
        clo = new Clothing("L", 5, "Dress", "450", "5");
        clo1 = new Clothing("M", 5, "skirt", "500", "10");

        assertEquals("L", clo.getSize());
        assertEquals(5, clo.getId());
        assertEquals("Dress", clo.getName());
        assertEquals("450", clo.getPrice());
        assertEquals("5", clo.getQty());

        clo1.setSize("M");
        clo1.setId(76);
        clo1.setName("skirt");
        clo1.setPrice("500");
        clo1.setQty("10");

    }

}
