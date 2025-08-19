//Questão 3

public class Aluno {

    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calcularMedia());

    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println(nome + " está APROVADO! Média: " + media);
            System.out.println("Parabéns, " + nome + "!");

        } else {
            System.out.println(nome + " está REPROVADO! Média: " + media);
            System.out.println("Infelizmente, " + nome + ", você não foi aprovado desta vez.");

        }
    }

    public void atualizarNotaAv2(double novaNota) {
        this.notaAv2 = novaNota;
    }
}
