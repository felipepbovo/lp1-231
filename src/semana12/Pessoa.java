package semana12;

public class Pessoa {
    public double altura;
    public double peso;

    public Pessoa (double altura, double peso){
        this.altura = altura;
        this.peso = peso;
}

public double calcularIMC() {
    return peso / ((altura * altura)/10000);
}

public String getFaixa() {
    if(calcularIMC() < 18.5) {
        return "Classificação: Baixo Peso";

    } else if(calcularIMC() >= 18.5 && calcularIMC() < 25) {
        return "Classificação: Peso Normal";

    } else if(calcularIMC() >= 25 && calcularIMC() < 30) {
        return "Classificação: Excesso de peso";

    } else if(calcularIMC() >= 30 && calcularIMC() < 35) {
        return "Classificação: Obesidade classe 1";

    } else if(calcularIMC() >= 35 && calcularIMC() < 40) {
        return "Classificação: Obesidade classe 2";

    } else {
        return "Classificação: Obesidade classe 3";    
    }
}

public String getSituacao() {
    double PerderPeso = peso - (24.9 * altura * altura);

    if(PerderPeso < 0) {
        return "GANHAR";

    } else  if(PerderPeso > 0) {
        return "PERDER";

    } else {
        return "NORMAL";
    }
}

}