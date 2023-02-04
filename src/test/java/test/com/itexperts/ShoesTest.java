/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Shoes;
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
public class ShoesTest {
    Shoes sh;
    Shoes sh1;

    public ShoesTest() {
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
        sh = new Shoes("10", 23, "Sneaker", "250", "1");
        sh1 = new Shoes("7", 78, "nike", "350", "2");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestShoes() {
        
         Shoes s = new Shoes();
        
        sh = new Shoes("10", 23, "Sneaker", "250", "1");
         sh1 = new Shoes("7", 78, "nike", "350", "2");
        
         assertEquals("10", sh.getSize());
         assertEquals(23, sh.getId());
         assertEquals("Sneaker", sh.getName());
         assertEquals("250",sh.getPrice());
         assertEquals("1" , sh.getQty());
         
         
          sh1 = new Shoes("7", 78, "nike", "350", "2");
          
          sh1.setSize("7");
          sh1.setId(78);
          sh1.setName("nike");
          sh1.setPrice("350");
          sh1.setQty("2");
          
          

    }

   
}
