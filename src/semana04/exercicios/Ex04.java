package semana04.exercicios;

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {
            
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o código identificador");
            String codi = sc.nextLine();

            if(codi.startsWith("BR") && codi.endsWith("X") && codi.length() == 7){
                System.out.println("código válido");
            }else{
                System.out.println("código inválido");
            }
            sc.close();
        }
    }

