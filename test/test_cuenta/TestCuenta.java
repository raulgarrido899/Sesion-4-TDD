package test_cuenta;

import Cuenta.Cuenta;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author usuario
 */
public class TestCuenta {
    
    Cuenta cuenta;
    
    public TestCuenta() {
    }
    
    @Before
    public  void setUpClass(){
        cuenta = new Cuenta("0001.0002.12.1234567890","default_name");
    }
    
    @Test
    public void testIngresar_double() throws Exception{
        System.out.println("Ingresar");
        double x=1000.0;
        try {
            cuenta.ingresar(x);
            assertTrue(cuenta.getSaldo()==1000.0);
        } catch (Exception e) {
            fail("No deberia haber fallado");
        }
    }
    
    @Test
    public void testRetirar_double() throws Exception{
        System.out.println("Retirar");
        double x=1000.0;
        try {
            cuenta.retirar(x);
        } catch (Exception e) {
            fail("No deberia haber fallado");
        }
        assertTrue(cuenta.getSaldo()==0.0);

    }
}
