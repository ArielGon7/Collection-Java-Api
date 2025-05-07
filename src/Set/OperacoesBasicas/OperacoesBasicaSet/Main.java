package Set.OperacoesBasicas.OperacoesBasicaSet;

public class Main {
    public static void main(String[] args){

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "convidado(s) dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidados("Convidado", 1234);
        conjuntoConvidados.adicionarConvidados("Convidado", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado", 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "convidado(s) dentro do Set de convidados");

    }
}
