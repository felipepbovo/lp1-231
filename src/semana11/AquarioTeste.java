package semana11;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AquarioTeste {
    @Test
    public void testeCalcularVolume(){

        //Arrange
        Aquario aquario = new Aquario();
        aquario.comprimento =100;
        aquario.largura =50;
        aquario.altura = 50;

        //act
        double volume = aquario.calcularVolume();

        // Assert
        assertEquals (250.00, volume);


    }
    @Test
    public void testecalcularPotenciaDoTermostato (){
        Aquario aquario = new Aquario();
        aquario.TemperaturaAmbiente = 24;
        aquario.TemperaturaDesejada= 34;

        double PotenciaDoTermostato = aquario.calcularPotenciaDoTermostato();

        assertEquals(0.3456, PotenciaDoTermostato, 0.001);
    
    }



}