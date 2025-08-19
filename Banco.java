
public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João Silva";
        conta1.numeroConta = "123456789";
        conta1.saldo = 1000.00;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Ana Souza";
        conta2.numeroConta = "987654321";
        conta2.saldo = 500.00;

        System.out.println("Titular: " + conta1.titular);
        System.out.println("Número da Conta: " + conta1.numeroConta);
        conta1.consultarSaldo();

        conta1.depositar(500.00);
        conta1.consultarSaldo();

        conta1.sacar(200.00);
        conta1.consultarSaldo();

        conta1.sacar(1500.00);
        conta1.consultarSaldo();

        System.out.println("Titular: " + conta2.titular);
        System.out.println("Número da Conta: " + conta2.numeroConta);
        conta2.consultarSaldo();
        conta2.depositar(300.00);
        conta2.consultarSaldo();
    }
}
