public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("nome do Filme: " + nome);
        System.out.println("Ano de Lançamento do Filme: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
        System.out.println("Avaliação do filme: " + somaDasAvaliacoes);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    void mediaAvaliacoes (){
        double mediaAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
        System.out.println("a média das avaliações do filme é: " + mediaAvaliacoes);
    }
}
