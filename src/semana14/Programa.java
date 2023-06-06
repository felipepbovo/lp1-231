package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        quadrado.setLado(5.6);
        System.out.println(quadrado.getLado());

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        //UTILIZANDO CONSTRUTOR PARA A CLASSE RETÂNGULO

        Retangulo r1 = new Retangulo(10.0, 5.0);
        r1.setAltura(10);
        r1.setBase(12);
        Retangulo r2 = new Retangulo(15.5, 3.5);
        r2.setAltura(15);
        r2.setBase(13);

        System.out.println(r1.getAltura());
        System.out.println(r1.getBase());
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());

        System.out.println(r2.getAltura());
        System.out.println(r2.getBase());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());

        Circulo c1 = new Circulo(10);
        c1.setRaio(10);
        System.out.println(c1.getRaio());
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());

        Circulo c2 = new Circulo(15);
        c2.setRaio(15);
        System.out.println(c2.getRaio());
        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularPerimetro());


    }
}
