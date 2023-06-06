package semana14;

public class Quadrado {
    private double lado;

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double calcularArea(){
        return lado*lado;
    }
    public double 
    calcularPerimetro(){
        return 4 * lado;
    }

    //public TIPO_ATRIBUTO getNOMEDOATRIBUTO (){
    //    return ATRIBUTO;
    // }

    public double getLado(){
        return lado;
    }

    // public void seNOME_DO_ATRIBUTO (TIPO_ATRIBUTO NOME_DO_ATRIBUTO){
    //     this.NOME_DO_ATRIBUTO = NOME_DO_ATRIBUTO;
    // }

    public void setLado (double lado){
        if (lado <= 0){
            throw new RuntimeException("Lado inválido");
        }
        this.lado = lado;
    }
}
