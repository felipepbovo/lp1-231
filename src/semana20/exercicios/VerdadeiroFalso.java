package semana20.exercicios;

public class VerdadeiroFalso extends Questao{
    private boolean respostaCorreta;


    public VerdadeiroFalso(int numero, String enunciado, boolean respostaCorreta) {
        super(numero, enunciado);
        this.respostaCorreta = respostaCorreta;
    }

    public boolean getRespostaCorreta(){
        return respostaCorreta;
    }


}