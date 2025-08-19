// Questão 1 e 2

public class ProjetoLivraria {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Lidia Tapajós";
        cliente1.idade = 18;
        cliente1.telefone = "9198555258";

        cliente1.cadastrar();
        cliente1.mostrarDados();

        System.out.println();
        Livro obj1 = new Livro();
        Livro obj2 = new Livro();

        obj1.titulo = "O príncipe cruel";
        obj1.numeroPaginas = 340;
        obj1.anoPublicacao = 2016;
        obj1.preco = 59.90;

        obj2.titulo = "A rainha vermelha";
        obj2.numeroPaginas = 400;
        obj2.anoPublicacao = 2015;
        obj2.preco = 49.90;

        System.out.println("Título: " + obj1.titulo);
        System.out.println("Número de Páginas: " + obj1.numeroPaginas);
        System.out.println("Ano de Publicação: " + obj1.anoPublicacao);
        System.out.printf("Preço: R$ %.2f\n", obj1.preco);
        obj1.cadastrar();
        double frete = obj1.calcFrete("12345-678");
        System.out.println("Valor do frete: R$ " + frete);

        System.out.println("\nTítulo: " + obj2.titulo);
        System.out.println("Número de Páginas: " + obj2.numeroPaginas);
        System.out.println("Ano de Publicação: " + obj2.anoPublicacao);
        System.out.printf("Preço: R$ %.2f\n", obj2.preco);
        obj2.cadastrar();
        frete = obj2.calcFrete("12345-678");
        System.out.println("Valor do frete: R$ " + frete);

    }
}
