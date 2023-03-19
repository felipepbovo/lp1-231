package semana04.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular a média aritmética de três números!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três valores:");

        float numero1 = sc.nextFloat();
        float numero2 = sc.nextFloat();
        float numero3 = sc.nextFloat();
        float media = (numero1 + numero2 + numero3)/3;

        System.out.println("O resultado da média foi de: " + media);
        sc.close();
    }
}