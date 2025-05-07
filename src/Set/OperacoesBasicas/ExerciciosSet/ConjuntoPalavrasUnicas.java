package Set.OperacoesBasicas.ExerciciosSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
            palavrasUnicasSet.remove(palavra);
        }else{
            System.out.println("Palavra nao encontrada");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavras(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else{
            System.out.println("Nenhuma palavra encontrada");
        }
    }
}
