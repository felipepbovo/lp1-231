package semana20.exercicios;
import java.util.ArrayList;
import java.util.List;

public class MultiplaEscolha extends Questao{
    private List<String> opcoes;

    public MultiplaEscolha(int numero, String enunciado, List<String> opcoes) {
        super(numero, enunciado);
        this.opcoes = opcoes;
    }

    public list<String> getOpcoes(){
        return opcoes;
    }

}