package semana14;

public class Aquario {
    double comprimento = 0.0;
    double altura = 0.0;
    double largura = 0.0;

   
    public Aquario(double comprimento, double altura, double largura) {
        setComprimento(comprimento);
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double valor) {
        this.comprimento = valor;
        this.altura = valor;
        this.largura = valor;
    }

  
    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

 
    public void setComprimento(double comprimento) {
        if (comprimento <= 0.0) {
            throw new RuntimeException("Comprimento Inválido");
        }

        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new RuntimeException("Altura Inválido");
        }

        this.altura = altura;
    }

    public void setLArgura(double largura) {
        if (largura <= 0.0) {
            throw new RuntimeException("Largura Inválido");
        }

        this.largura = largura;
    }

  
    public double calcularVolume() {
        return ((comprimento * altura * largura) / 1000);
    }

    public double calcularPotenciaDoTermostato(double temperaturaAmbiente, double temperaturaDesejada) {
        return (calcularVolume() * 0.05 * (temperaturaAmbiente - temperaturaDesejada));
    }

    public double[] calcularQuantidadeLitrosFiltro() {
        double[] array1 = { calcularVolume() * 3, calcularVolume() * 2 };
        return array1;
    }
}