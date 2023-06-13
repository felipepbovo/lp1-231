package semana14;

public class ProgramaEX3 {
    public static void main(String[] args) {
        Conta conta = new Conta(1, "Adamastor");
        Conta conta1 = new Conta(2, "Jorge");
        Conta conta2 = new Conta(3, "Felipe");
        
        conta.depositar(9900.0);
        conta1.depositar(9900.0);
        conta2.depositar(4000.0);

     
        conta.sacar(15.0);
        conta1.sacar(990.0);
        conta2.sacar(4.5);

      
        conta.transferir(100.0, conta1);
        conta.transferir(20.5, conta2);
        conta1.transferir(50.5, conta);
        conta1.transferir(250.0, conta2);
        conta2.transferir(400.0, conta);
        conta2.transferir(600.0, conta1);

        
        conta.verSaldo();
        conta1.verSaldo();
        conta2.verSaldo();

    }
}