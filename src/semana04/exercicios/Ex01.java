package semana04.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Programa que dira o antecessor e o sucessor de um número!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o seu número");
        int numero = sc.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}