package semana21;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return lado * lado;
    }

    @Override
    public double CalcularPerimetro() {
        return 4 * lado;
    }
    
}
