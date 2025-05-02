package List.OperacoesBasicas.Pesquisa.ExercicioPesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer numero : numeroList)
            soma += numero;
        System.out.println(soma);
        return soma;

    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        System.out.println(this.numeroList);

    }


}





