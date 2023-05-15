package semana11;

public class Aquario {

    public double comprimento;
    public double largura;
    public double altura;
    public double TemperaturaDesejada;
    public double TemperaturaAmbiente;

    public double calcularVolume(){
        return ((comprimento * altura * largura)/1000);
}

    public double calcularPotenciaDoTermostato (){
        return calcularVolume() * 0.05 * (TemperaturaDesejada - TemperaturaAmbiente);

}

    public double calcularQuantidadeMinimaLitrosFiltro (){
        return (int) Math.round(calcularVolume() * 2); 
     
}

    public double calcularQuantidadeMaximaLitrosFiltro (){
        return (int) Math.round(calcularVolume() * 3);

    }
    
}