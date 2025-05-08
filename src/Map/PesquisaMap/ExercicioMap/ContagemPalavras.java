package Map.PesquisaMap.ExercicioMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagem += contagem;
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavrasMap.remove(palavra);
    }


    /*//**/
}
