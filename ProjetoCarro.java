// Questão 5

public class ProjetoCarro {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.marca = "Volkswagen";
        meuCarro.ano = 1976;

        meuCarro.info();
        meuCarro.ligar();
        System.out.println("Esse é o meu carro!");

        Carro Carro2 = new Carro();
        Carro2.modelo = "Civic";
        Carro2.marca = "Honda";
        Carro2.info();
        Carro2.ligar();

        System.out.println("Agora esse é meu carro novo!");
    }
}
