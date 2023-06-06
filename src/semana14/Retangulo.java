package semana14;

public class Retangulo {
    //atributos
    public double base;
    public double altura;

    //construtor
    public Retangulo(double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    //métodos
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
    
    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase (double base){
        if (base > 0){
            throw new RuntimeException("base inválida");
        }
        this.base = base;
    }

    public void setAltura (double altura){
        if (altura > 0){
            throw new RuntimeException("altura inválida");
        }
        this.altura = altura;
    }
}
