import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DummiTest {
    @Before
    public void beforeTestDO(){
        System.out.println("Antes de las pruebas");
    }
    @Test
    public void dummiTest(){
        System.out.println("Esta es una prueba");
        assertTrue(true);
    }
    @After
    public void afterTestDo(){
        System.out.println("Despues de las pruebas");
    }
}
