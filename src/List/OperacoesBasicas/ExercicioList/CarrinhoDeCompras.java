package List.OperacoesBasicas.ExercicioList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoCompras.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!carrinhoCompras.isEmpty()) {
            for (Item i : carrinhoCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }

            }
            carrinhoCompras.removeAll(itemsParaRemover);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!carrinhoCompras.isEmpty()) {
            for (Item it : carrinhoCompras) {
                double valorItem = it.getPreco() * it.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirCarrinho(){
        if(!carrinhoCompras.isEmpty()){
            System.out.println(this.carrinhoCompras);
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoCompras=" + carrinhoCompras +
                '}';
    }
}
