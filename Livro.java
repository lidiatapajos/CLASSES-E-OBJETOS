// Questão 1 e 2

public class Livro {

    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    void cadastrar() {
        System.out.println("Cadastrando no banco de dados...");
    }

    double calcFrete(String cep) {
        System.out.println("Calculando frete para o CEP: " + cep);
        double valorFrete = 15.0;
        return valorFrete;
    }

    void vender() {
        System.out.printf("Vendendo Livro por R$ %.2f", preco);
    }

    String trocar() {
        return "Livro trocado com sucesso!";
    }
}
