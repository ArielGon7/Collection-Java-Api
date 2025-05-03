package List.OperacoesBasicas.OperacoesBasicasList.ExercicioList;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinhoDeCompras = new CarrinhoDeCompras();

        meuCarrinhoDeCompras.adicionarItem("Lapis", 2.50, 1);
        meuCarrinhoDeCompras.adicionarItem("borracha", 5.00, 1);
        meuCarrinhoDeCompras.adicionarItem("regua", 2.00, 2);

        meuCarrinhoDeCompras.exibirCarrinho();

        meuCarrinhoDeCompras.removerItem("regua");
        meuCarrinhoDeCompras.exibirCarrinho();



        System.out.println(meuCarrinhoDeCompras.calcularValorTotal());
    }
}
