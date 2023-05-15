package semana11;

public class ProgramaEx01{
    public static void main(String[] args) {
    
    Aquario aq1 = new Aquario ();
    aq1.altura = 12.0;
    aq1.comprimento = 12.0;
    aq1.largura = 12.0;
    aq1.TemperaturaAmbiente = 23.0;
    aq1.TemperaturaDesejada = 28.0;

    System.out.println(aq1.calcularVolume());
    System.out.println(aq1.calcularPotenciaDoTermostato());
    System.out.println(aq1.calcularQuantidadeMaximaLitrosFiltro());
    System.out.println(aq1.calcularQuantidadeMinimaLitrosFiltro());
    
    }

}
