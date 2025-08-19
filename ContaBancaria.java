
public class ContaBancaria {

    String numeroConta;
    double saldo;
    String titular;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        System.out.println("---------------------------------------------------------");
    }
}
