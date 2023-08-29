package semana21;

public class Circulo implements FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double CalcularArea(){
    return Math.PI * (raio * raio);
    }

    @Override
    public double CalcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}