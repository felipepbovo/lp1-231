package semana20.exercicios;

public class Main{
    public static void main (String[] args){
        Prova prova = new Prova();

        QuestaoMultiplaEscolha questaoMultipla = new QuestaoMultiplaEscolha (1,"qual é a capital da França?", List.of("Paris", "Londres", "Madri", "Berlim"));
        prova.adicionarquestao(questaoMultipla);

        QuestaoVerdadeiroFalso questaoVerdadeiroFalso = new QuestaoVerdadeiroFalso(2, "A Terra é plana?", false);
        prova.adicionarQuestao(questaoVerdadeiroFalso);

        QuestaoUnicaEscolha questaoUnica = new QuestaoUnicaEscolha(3,"Qual é o maior planeta do sistemna solar?", "Jupiter");
        prova.adicionarQuestao(questaounica);

        System.out.println("Pontuaçao total da prova: " + prova.CalcularPontuacaoTotal());
     }
}