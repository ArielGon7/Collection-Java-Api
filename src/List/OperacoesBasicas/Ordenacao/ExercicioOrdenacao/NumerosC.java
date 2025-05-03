package List.OperacoesBasicas.Ordenacao.ExercicioOrdenacao;

import java.util.Comparator;

public class NumerosC implements Comparable<NumerosC>{
    private int numero;

    @Override
    public int compareTo(NumerosC o) {
        return Integer.compare(numero, o.getNumero());
    }

    public NumerosC(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "NumerosC{" +
                "numero=" + numero +
                '}';
    }
}

class ordenarPorDescendente implements Comparator<NumerosC>{

    @Override
    public int compare(NumerosC n1, NumerosC n2) {
        return Integer.compare(n1.getNumero(), n2.getNumero());
    }
}
