package semana14;

import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

public class TestFormas {
    @Test
    public void TestThrowException(){
        Quadrado q1 = new Quadrado(10);
        assertThrows(RuntimeException.class, () -> q1.setLado(0));

    }
    
}
