package semana07;

public class exerciciosRevisao {
    public static double ex01 (double num1, double num2, double num3) {
        return(num1+ num2+ num3);
    }

    public static double ex02 (double n1, double n2, double n3) {
        return(n1+n2+n3)/3;
    }

    public static int ex03 (int n1, int n2, int n3) {
        return (Math.max(n1,Math.max (n2, n3)));
    }

    public static int ex04 (int n1, int n2, int n3) {
        return (Math.min(n1,Math.min (n2, n3)));
    }

    public static double[] ex05 (double n1, double n2, double n3) {
        double[] array = {n1, n2, n3};
        return array;
    }   

    public static double ex06 (double[] array) {
        double soma = 0;
        for (double i : array){
        soma += i;
        }
        return soma;
    }   

    public static double ex07 (double[] array) {
        double soma = 0.0;
        for (double i : array){
        soma += i;
        }
        return soma/array.length;
    }   

    public static double ex08 (double[] array) {
    double maior = array[0];
    for (int i =1; i< array.length; i++){
        if (array [i] > maior){
            maior =array[i];
        }
    }
    return maior;
    }   

    public static double ex09 (double[] array) {
        double menor = array[0];
        for (int i =1; i< array.length; i++){
            if (array [i] < menor){
                menor =array[i];
            }
        }
        return menor;
    }

    public static int[] ex10 (int[] array1, int[] array2) {
        int[] resultado = new int[array1.length + array2.length];
        int indice = 0;
        for (int valor : array1){
            resultado[indice]= valor;
            indice++;
        }
        for (int valor : array2){
            resultado[indice] = valor;
            indice++;
        }
        return resultado;
    }
}