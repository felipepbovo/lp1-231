package semana17;

import java.util.List;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> conta;
    public Correntista(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}