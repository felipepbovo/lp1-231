package semana20.exercicios;

public class UnicaEscolha extends Questao{
    private String opcaoCorreta;

    public UnicaEscolha(int numero, String enunciado, String opcaoCorreta) {
        super(numero, enunciado);
        this.opcaoCorreta = opcaoCorreta;
    }

    public String getOpcaoCorreta(){
        return opcaoCorreta;
    }

}