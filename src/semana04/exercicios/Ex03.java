package semana04.exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula o desconto em compras!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço da sua compra: ");
        double valor = sc.nextDouble();

        
        if (valor <= 9.99) {
            System.out.println("Compras com menos de R$ 9,99 não tem desconto, logo, valor final: R$" + valor);
        }

        if (valor >= 10 && valor <= 99.99) {
            double desconto_5 = valor - (valor * 0.05);
            System.out.println("Você recebeu um desconto de 5%, valor final: R$" + desconto_5);
        }

        if (valor >= 100 && valor <= 499.99) {
            double desconto_10 = valor - (valor * 0.10);
            System.out.println("Você recebeu um desconto de 10%, valor final: R$" + desconto_10);
        }

        if (valor >= 500.00) {
            double desconto_15 = valor - (valor * 0.15);
            System.out.println("Você recebeu um desconto de 15%, valor final: R$" + desconto_15);
        }
        sc.close();
    }
    
}