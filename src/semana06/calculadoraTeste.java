package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class calculadoraTeste {
    @Test
    public void somaDoisNumerosPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Action
        double soma = Calculadora.somar(n1, n2);

        // Assert
        assertEquals(12.0, soma); 
    }

    @Test
    public void somaUmNumeroPositivoEUmNegativo(){
    
        double n1 = 10.0;
        double n2 = -2.0;

        double soma = Calculadora.somar(n1, n2);

        assertEquals(8.0, soma); 
    }

    @Test
    public void somadoisNumerosNegativos(){
    
        double n1 = -10.0;
        double n2 = -2.0;

        double soma = Calculadora.somar(n1, n2);

        assertEquals(-12.0, soma); 
    }

    @Test
    public void SubtraiDoisNumerosPositivos(){
    
        double n1 = 10.0;
        double n2 = 2.0;

        double soma = Calculadora.subtrair(n1, n2);

        assertEquals(8.0, soma); 
    }
    @Test
    public void SubtraiUmNumeroPositivoEUmNegativo(){
    
        double n1 = -10.0;
        double n2 =  2.0;

        double soma = Calculadora.subtrair(n1, n2);

        assertEquals(-12.0, soma); 
    }
    @Test
    public void SubtraiDoisNumerosnegativos(){
    
        double n1 = -10.0;
        double n2 = -2.0;

        double soma = Calculadora.subtrair(n1, n2);

        assertEquals(-8.0, soma); 
    }
    @Test
    public void MultiplicaDoisNumerosPositivos(){
    
        double n1 = 10.0;
        double n2 = 2.0;

        double soma = Calculadora.multiplicar(n1, n2);

        assertEquals(20.0, soma); 
    }
    @Test
    public void MultiplicaUmNumeroPositivoEUmNegativo(){
    
        double n1 = -10.0;
        double n2 = 2.0;

        double soma = Calculadora.multiplicar(n1, n2);

        assertEquals(-20.0, soma); 
    }
    @Test
    public void MultiplicaDoisNumerosNegativos(){
    
        double n1 = -10.0;
        double n2 = -2.0;

        double soma = Calculadora.multiplicar(n1, n2);

        assertEquals(20.0, soma); 
    }
    @Test
    public void DividiDoisNumerosPositivos(){
    
        double n1 = 10.0;
        double n2 = 2.0;

        double soma = Calculadora.dividir(n1, n2);

        assertEquals(5.0, soma); 
    }
    @Test
    public void DividiUmNumeroPositivoEUnumeroNegativo(){
    
        double n1 = -10.0;
        double n2 = 2.0;

        double soma = Calculadora.dividir(n1, n2);

        assertEquals(-5.0, soma); 
    }
    @Test
    public void DividirDoisNumerosNegativos(){
    
        double n1 = -10.0;
        double n2 = -2.0;

        double soma = Calculadora.dividir(n1, n2);

        assertEquals(5.0, soma); 
    }
    @Test
    public void DivisaoComNumero0(){
    
        double n1 = 10.0;
        double n2 = 0;

        double soma = Calculadora.dividir(n1, n2);

        assertEquals(0.0, soma);
    }
}