package semana12;

public class Aquario {
    public double comprimento;
    public double largura;
    public double altura;
    public double TemperaturaDesejada;
    public double TemperaturaAmbiente;

    public Aquario(){
        
    }
    public Aquario(double comprimento, double largura, double altura){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public Aquario(double valor){
        this.comprimento = valor;
        this.largura = valor;
        this.altura = valor;
    }

    public double calcularVolume(){
        return ((comprimento * altura * largura)/1000);
    
    }
    public double calcularQuantidadeMinimaLitrosFiltro (){
        return (int) Math.round(calcularVolume() * 2); 
     
}

public double calcularQuantidadeMaximaLitrosFiltro (){
    return (int) Math.round(calcularVolume() * 3);

}

public double calcularPotenciaDoTermostato (){
    return calcularVolume() * 0.05 * (TemperaturaDesejada - TemperaturaAmbiente);
    }
}