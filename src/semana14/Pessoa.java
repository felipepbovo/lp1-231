package semana14;

public class Pessoa {
    
    final double IMC_IDEAL_MINIMO = 18.5;
    final double IMC_IDEAL_MAXIMO = 24.9;
    double altura = 0.0;
    double peso = 0.0;


    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new RuntimeException("Altura Inválido");
        }

        this.altura = altura;
    }

    public void setPeso(double peso) {
        if (peso <= 0.0) {
            throw new RuntimeException("Peso Inválido");
        }

        this.peso = peso;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String getFaixa() {
        double imc = calcularImc();

        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Excesso de peso";
        } else if (imc < 35) {
            return "Obesidade de Classe 1";
        } else if (imc < 40) {
            return "Obesidade de Classe 2";
        } else {
            return "Obesidade de Classe 3";
        }

    }

    public String getSituacao() {
        double imc = calcularImc();

        if (imc < IMC_IDEAL_MINIMO || imc > IMC_IDEAL_MAXIMO) {
            if (imc < IMC_IDEAL_MINIMO) {
                return "GANHAR";
            } else {
                return "PERDER";
            }
        }

        return "NORMAL";
    }

}