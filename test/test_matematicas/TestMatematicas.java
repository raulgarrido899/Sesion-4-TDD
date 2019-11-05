package test_matematicas;

import matematicas.Matematicas;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestMatematicas {
    
    public TestMatematicas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSuma(){
        assertEquals(5, Matematicas.Suma(2,3));
    }
    
    @Test
    public void testResta(){
        assertEquals(5, Matematicas.Resta(7,2));
    }
}
