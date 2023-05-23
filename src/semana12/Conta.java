package semana12;
    
    public class Conta {
        public int codigo;
        public double saldo;
        public String correntista;
    
        public Conta(int codigo, String correntista) {
            if(codigo <= 0) 
                throw new IllegalArgumentException("Código não esta correto");
    
            if(correntista == " " || correntista == "") 
                throw new IllegalArgumentException("insira o nome do responsavel pela conta");
    
            this.codigo = codigo;
            this.correntista = correntista;
        }
    
        public double sacar(double valor) {
            if(valor > saldo)
                throw new IllegalArgumentException("O valor é maior que esta tentando sacar é maior que o seu saldo");
            return saldo -= valor;
        }
    
        public double depositar(double valor) {
            return saldo += valor;
        }
    
        public double transferir(Conta contaDestino, double valor) {
            if(valor > saldo)
                throw new IllegalArgumentException("O valor que esta tentendo tranferido é maior do que o seu saldo");
    
            sacar(valor);
            contaDestino.depositar(valor);
            return saldo;
        }
    }