package semana20.exercicios;

public class QuestaoUnicaEscolha extends Questao{
    private String opcaoCorreta;

    public QuestaoUnicaEscolha(int numero, String enunciado, String opcaoCorreta) {
        super(numero, enunciado);
        this.opcaoCorreta = opcaoCorreta;
    }

    public String getOpcaoCorreta(){
        return opcaoCorreta;
    }

}