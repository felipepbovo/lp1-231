package semana20.exercicios;
import java.util.List;

public class Main{
    public static void main (String[] args){
        Prova prova = new Prova();

        QuestaoMultiplaEscolha questaoMultipla = new QuestaoMultiplaEscolha (1,"qual é a capital da França?", List.of("Paris", "Londres", "Madri", "Berlim"));
        prova.adicionarQuestao(questaoMultipla);

        QuestaoVerdadeiroFalso questaoVerdadeiroFalso = new QuestaoVerdadeiroFalso(2, "A Terra é plana?", false);
        prova.adicionarQuestao(questaoVerdadeiroFalso);

        QuestaoUnicaEscolha questaoUnica = new QuestaoUnicaEscolha(3,"Qual é o maior planeta do sistemna solar?", "Jupiter");
        prova.adicionarQuestao(questaoUnica);

        System.out.println("Pontuaçao total da prova: " + prova.CalcularPontuacaoTotal());
     }
}