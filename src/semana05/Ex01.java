package semana05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        double comprimento, altura, largura, volume, PotenciaDoTermostato;
        int TemperaturaAmbiente, TemperaturaDesejada;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura");
        largura = sc.nextDouble();
        System.out.println("digite o comprimento");
        comprimento = sc.nextDouble();
        System.out.println("Digite a altura");
        altura = sc.nextDouble();

        volume = ((comprimento * altura * largura)/1000);

        System.out.println("O volume em litros do seu aquario é de: " + volume);

        System.out.println("Digite a temperatura ambiente");
        TemperaturaAmbiente = sc.nextInt();
        System.out.println("Digite a temperatura desejada");
        TemperaturaDesejada = sc.nextInt();

        PotenciaDoTermostato = volume * (TemperaturaDesejada - TemperaturaAmbiente);
         System.out.println("a potencia do temostato para a atingir a temperatura de: "+ TemperaturaDesejada + "C° será de: " +PotenciaDoTermostato + "watts" );

         int minimoFiltragem, maximoFiltragem;
         minimoFiltragem = (int) Math.round(volume * 2);
         maximoFiltragem = (int) Math.round(volume * 3);

         System.out.println("A quantidade de filtragem  que deve ser feita por hora é de: " + minimoFiltragem + " a " +maximoFiltragem+ " vezes");

    sc.close();
    }
}
