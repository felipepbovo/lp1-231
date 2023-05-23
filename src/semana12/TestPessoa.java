package semana12;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPessoa {

    @Test
    public void testeCalcularIMC(){

        Pessoa p1 = new Pessoa();
        p1.altura = 180;
        p1.peso = 67;

        double IMC = p1.calcularIMC();

        assertEquals(20.67, IMC, 0.1);
    }

    @Test
    public void testGetFaixa(){

        Pessoa p1 = new Pessoa();
        p1.altura = 180;
        p1.peso = 67;

        String classificacao = p1.getFaixa();

        assertEquals("Classificação: Peso Normal", classificacao);

    }

    @Test
    public void testgetSituacao(){

        Pessoa p1 = new Pessoa();
        p1.altura = 180;
        p1.peso = 67;

        String situacao = p1.getSituacao();

        assertEquals("GANHAR", situacao);



}
}