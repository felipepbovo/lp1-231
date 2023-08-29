package semana21;
import java.util.ArrayList;

//interface = contrato
//conjunto de metodos(somente assinatura, sem corpo)
//classe concreta que IMPLEMENTA a inteface

//class abstrata FiguraGeomertica
//interace FiguraGeometrica

//Quadrado - lado - calcular area e perimetro
//Retangulo - base, altura, calcular area e perimetro
//Circulo -...

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Main...");

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        Retangulo r1 = new Retangulo(10, 5);
        Circulo c1 = new Circulo (10);

        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        tela.addFigura(c1);
        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());

        //arrays
        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 3.0;
        notas[2] = 5.0;
        //notas[3] = 5.0;

        System.out.println(notas[0]);

        //Coleçoes
        //List
        //Set
        //Map chave - valor

        //String[] nomes =new String [10];
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("joao");
        nomes.add("maria");
        nomes.add("pedro");

        String nome = nomes.get(1);
        System.out.println(nome);

        System.out.println(nomes.size());

        //nomes.clear();

        System.out.println(nomes.size());

        // for (int i = 0; i < nomes.size(); i++){
        //     String nome = nomes.get(i);
        // }

        //nomes.remove(1);
        //      ou 
        nomes.remove("Maria");

        for (String n : nomes){
            System.out.println(n);
        }



    }
}
