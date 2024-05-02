import br.com.alura.screenmatch.modelo.Titulo;

public class Principal {
    public static void main(String[] args) {
        Titulo meuFilme = new Titulo();
        meuFilme.setNome("O Poderoso Chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(220);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
    }
}
