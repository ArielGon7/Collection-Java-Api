package List.Pesquisa.ExercicioPesquisa;

public class Maini {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);
        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.calcularSoma();




    }
}
