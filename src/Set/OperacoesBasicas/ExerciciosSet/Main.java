package Set.OperacoesBasicas.ExerciciosSet;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Oi");
        conjuntoPalavrasUnicas.adicionarPalavra("io");
        conjuntoPalavrasUnicas.adicionarPalavra("eae");
        conjuntoPalavrasUnicas.adicionarPalavra("opa");

        conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.verificarPalavra("");

        conjuntoPalavrasUnicas.removerPalavra("eae");
        conjuntoPalavrasUnicas.exibirPalavras();

    }
}
