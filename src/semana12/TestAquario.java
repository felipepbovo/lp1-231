package semana12;


    import org.junit.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    
    public class TestAquario  {
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
    
            assertEquals(0.3456, PotenciaDoTermostato, 1);
        
        }
    
        @Test
        public void testeQuantidadeMaximaLitrosFiltro() {
            Aquario aquario = new Aquario();
            aquario.altura = 12.0;
            aquario.comprimento = 12.0;
            aquario.largura = 12.0;
            
            double QuantidadeMaximaLitrosFiltro = aquario.calcularQuantidadeMaximaLitrosFiltro();
    
            assertEquals(5.0, QuantidadeMaximaLitrosFiltro);
    
        }
    
        @Test
        public void testeQuantidadeMinimaLitrosFiltro() {
            Aquario aquario = new Aquario();
            aquario.altura = 12.0;
            aquario.comprimento = 12.0;
            aquario.largura = 12.0;
            
            double QuantidadeMinimaLitrosFiltro = aquario.calcularQuantidadeMinimaLitrosFiltro();
    
            assertEquals(3.0, QuantidadeMinimaLitrosFiltro);
        }

        @Test
        public void TesteConstrutorVolume(){
            Aquario aquario = new Aquario(13, 12, 11);

            double volume = aquario.calcularVolume();

            assertEquals (1.716,volume);
        }
    
        @Test
        public void TesteConstrutorMaximaLitros(){
            Aquario aquario = new Aquario(13, 12, 11);
            double QuantidadeMaximaLitrosFiltro = aquario.calcularQuantidadeMaximaLitrosFiltro();

            assertEquals(5.0, QuantidadeMaximaLitrosFiltro);
        }
        
        @Test
        public void TesteConstrutorMinimaLitros(){
            Aquario aquario = new Aquario(13, 12, 11);
            double QuantidadeMinimaLitrosFiltro = aquario.calcularQuantidadeMinimaLitrosFiltro();

            assertEquals(3.0, QuantidadeMinimaLitrosFiltro);
        }

        @Test
        public void TesteConstrutorIgualVolume(){
            Aquario aquario = new Aquario(10);

            double volume = aquario.calcularVolume();

            assertEquals (1,volume);
        }

        @Test
        public void TesteConstrutorIgualMaximaLitros(){
            
            Aquario aquario = new Aquario(10);
            double QuantidadeMaximaLitrosFiltro = aquario.calcularQuantidadeMaximaLitrosFiltro();

            assertEquals(3.0, QuantidadeMaximaLitrosFiltro);
    }

    @Test
    public void TesteConstrutorIgualMinimaLitros(){

        Aquario aquario = new Aquario(10);
            double QuantidadeMinimaLitrosFiltro = aquario.calcularQuantidadeMinimaLitrosFiltro();

            assertEquals(2.0, QuantidadeMinimaLitrosFiltro);

    }
}