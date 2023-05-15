package semana11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PessoaTeste {
    @Test
    public void testeCalcularIMC() {

        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        double imc = p1.calcularIMC();

        assertEquals(23.7, imc, 0.1);
        
    }

        @Test
        public void testeFaixa() {
    
            Pessoa p1 = new Pessoa();
            p1.altura = 172;
            p1.peso = 70.3;
    
            String faixa = p1.getFaixa();
    
            assertEquals("Classificação: Peso Normal", faixa);
            
        }

        @Test
        public void testeSituacao() {
    
            Pessoa p1 = new Pessoa();
            p1.altura = 172;
            p1.peso = 70.3;
    
            String situacao = p1.getSituacao();
    
            assertEquals("GANHAR", situacao);
            
        }

}

