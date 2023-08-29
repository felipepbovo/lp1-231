package semana20.exercicios;

public class QuestaoVerdadeiroFalso extends Questao{
    private boolean respostaCorreta;


    public QuestaoVerdadeiroFalso(int numero, String enunciado, boolean respostaCorreta) {
        super(numero, enunciado);
        this.respostaCorreta = respostaCorreta;
    }

    public boolean getRespostaCorreta(){
        return respostaCorreta;
    }


}