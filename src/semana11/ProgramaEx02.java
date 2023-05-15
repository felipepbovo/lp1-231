package semana11;

public class ProgramaEx02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        System.out.println(p1.calcularIMC());
        System.out.println(p1.getFaixa());
        System.out.println(p1.getSituacao());

 }
}
