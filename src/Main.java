public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora" );
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.divisao(7, 8);
        Calculadora.multiplicacao(5, 2.5);

        //Mensagem
        System.out.println("\nExercício mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Emprestimo
        System.out.println("\nExercício emprestimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5 );

    }
}
