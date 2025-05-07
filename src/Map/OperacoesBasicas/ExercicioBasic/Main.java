package Map.OperacoesBasicas.ExercicioBasic;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Ola", "Cumprimento");
        dicionario.adicionarPalavra("Obrigado", "Agradecimento");
        dicionario.adicionarPalavra("Sambar", "Dancar");
        dicionario.adicionarPalavra("Solidao", "Sentimento");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Sambar");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Solidao"));

    }
}
