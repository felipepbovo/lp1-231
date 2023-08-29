package semana21;
import java.util.ArrayList;

public class Tela {
    //private ArrayList<Quadrado> quadrados;
    //private ArrayList<Retangulo> retangulos;
    private ArrayList<FiguraGeometrica> figuras;

    public Tela() {
        //quadrados = new ArrayList<>();
        //retangulos = new ArrayList<>();
        figuras = new ArrayList<>();
    }

    public void addFigura(FiguraGeometrica f){
        figuras.add(f);
    }

    public double totalArea (){
        double total = 0.0;
    

    for (FiguraGeometrica figura : figuras){
        total += figura.CalcularArea();
    }
    return total;
}

    public double totalPerimetro(){
    double total = 0.0;


    for (FiguraGeometrica figura : figuras){
        total += figura.CalcularPerimetro();
    }
    return total;
}

    // public void addQuadrado(Quadrado q){
    //     quadrados.add(q);
    // }

    // public void addRetangulo(Retangulo r){
    //     retangulos.add(r);
    // }

    // public double totalArea() {
    //     double total =0.0;

    //     for (Quadrado quadrado : quadrados){
    //         total += quadrado.CalcularArea();
    //     }

    //     for (Retangulo retangulo : retangulos){
    //         total += retangulo.CalcularArea();
    //     }

    //     return total;
    // }

    // public double totalPerimetro() {
    //     double total =0.0;

    //     for (Quadrado quadrado : quadrados){
    //         total += quadrado.CalcularPerimetro();
    //     }
        
    //     for (Retangulo retangulo : retangulos){
    //         total += retangulo.CalcularPerimetro();
    //     }

    //     return total;
    //  }
}
