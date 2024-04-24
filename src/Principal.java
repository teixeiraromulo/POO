public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme();

        meufilme.nome = "O Poderoso chefão";
        meufilme.anoDeLancamento = 1970;
        meufilme.duracaoEmMinutos = 180;
        meufilme.somaDasAvaliacoes = 7.5;


        meufilme.exibeFichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(4);
        meufilme.avalia(10);
        meufilme.avalia(10);
        meufilme.avalia(1);

        meufilme.mediaAvaliacoes();
    }
}
