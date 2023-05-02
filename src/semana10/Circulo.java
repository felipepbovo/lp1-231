package semana10;

public class Circulo {
    public double raio;

    // Math.pow(base, expoente)
    public double calcularArea(){
    return Math.PI * (raio * raio);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
