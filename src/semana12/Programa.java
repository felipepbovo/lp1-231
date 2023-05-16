package semana12;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        //UTILIZANDO CONSTRUTOR PARA A CLASSE RETÂNGULO

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());

        //UTILIZANDO CONSTRUTOR PARA A CLASSE CÍRCULO

        Circulo c1 = new Circulo(10.0);
        Circulo c2 = new Circulo(20.0);

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularPerimetro());

    System.out.println("aqui começa o aquario");

        Aquario aq1 = new Aquario(13,12,11);
        Aquario aq2 = new Aquario(10);

        System.out.println(aq1.calcularVolume());
        System.out.println(aq1.calcularQuantidadeMaximaLitrosFiltro());
        System.out.println(aq1.calcularQuantidadeMinimaLitrosFiltro());

        System.out.println("aqui começa o aq2");
        
        System.out.println(aq2.calcularVolume());
        System.out.println(aq2.calcularQuantidadeMaximaLitrosFiltro());
        System.out.println(aq2.calcularQuantidadeMinimaLitrosFiltro());

    }
}
