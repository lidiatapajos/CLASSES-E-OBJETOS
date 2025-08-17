
public class ProjetoAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.matricula = 67890;
        aluno1.notaAv1 = 9.0;
        aluno1.notaAv2 = 6.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Carlos";
        aluno2.matricula = 54321;
        aluno2.notaAv1 = 5.0;
        aluno2.notaAv2 = 4.5;

        aluno1.mostrarDados();
        aluno1.verificarAprovacao();

        aluno2.mostrarDados();
        aluno2.verificarAprovacao();

        aluno2.atualizarNotaAv2(9.0);
        System.out.println("Após atualização da nota AV2 de " + aluno2.nome + ":");
        aluno2.mostrarDados();
        System.out.println("Verificando aprovação novamente:");
        aluno2.verificarAprovacao();
    }
}
