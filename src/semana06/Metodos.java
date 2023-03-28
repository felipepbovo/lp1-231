package semana06;

public class Metodos {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        imprimirPalavra("Olá mundo!");
        imprimirPalavra("testeTeste");
        double soma = Calculadora.somar(10.0, 2.3);
        System.out.println(soma);

        System.out.println(Calculadora.somar (3.3, 4.1));

    }

    // método que soma dois numeros e retorna o resultado
    // Assinatura do metodo
    // public - acesso em qualquer parte do projeto
    // static - método atrelado a classe (nao precisa criar um objeto)
    // void - tipo de retorno (sem retorno)
    // imprimirpalavra - nome do método
    // String palavra - parâmetro (pode ter zero ou muitos)
    // Definindo o método
    
    public static void imprimirPalavra(String palavra){
    System .out.println(palavra.toUpperCase());
    
    }
}