package List.OperacoesBasicas.Ordenacao.ExercicioOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros{
    List<NumerosC> numeroList = new ArrayList<>();

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new NumerosC(numero));
    }

    public List<NumerosC> ordenarAscendente(){
        List<NumerosC> numerosAscedentes = new ArrayList<>(numeroList);
        Collections.sort(numerosAscedentes);
        return numerosAscedentes;
    }

    public List<NumerosC> ordenarDescendente(){
        List<NumerosC> numerosDescendente = new ArrayList<>(numeroList);
        numerosDescendente.sort(Comparator.reverseOrder());
        return numerosDescendente;
    }
}
