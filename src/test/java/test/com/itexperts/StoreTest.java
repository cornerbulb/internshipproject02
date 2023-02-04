/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexperts;

import com.mycompany.itexpert.nest.Store;
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
public class StoreTest {

    Store st;
    Store st0;

    public StoreTest() {
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
        st = new Store(5460, "Jcpenny", "234 North Aurora", "6304562351");
        st0 = new Store(6010, "guess", "567 aurora ave 67834", "56789012");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void TestSSS() {
           Store str = new Store();
        
        st = new Store(5460, "Jcpenny", "234 North Aurora", "6304562351");
        st0 = new Store(6010, "guess", "567 aurora ave 67834", "56789012");

        assertEquals(5460, st.getId());
        assertEquals("Jcpenny", st.getName());
        assertEquals("234 North Aurora", st.getAddress());
        assertEquals("6304562351", st.getPhone());

        st0.setId(6010);
        st0.setName("guess");
        st0.setAddress("567 aurora ave 67834");
        st0.setPhone("56789012");
        st0.setProductList(st.getProductList()); 
        st0.setDepartmentList(st.getDepartmentList()); 

    }
}
