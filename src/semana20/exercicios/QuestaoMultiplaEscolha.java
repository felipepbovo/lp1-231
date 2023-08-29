package semana20.exercicios;
import java.util.List;

public class QuestaoMultiplaEscolha extends Questao{
    private List<String> opcoes;

    public QuestaoMultiplaEscolha(int numero, String enunciado, List<String> opcoes) {
        super(numero, enunciado);
        this.opcoes = opcoes;
    }

    public List<String> getOpcoes(){
        return opcoes;
    }

}