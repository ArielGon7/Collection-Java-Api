package List.OperacoesBasicas.OperacoesBasicasList.AulaBasic;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.adicionarTarefas("Tarefa 1");
        listaTarefas.adicionarTarefas("Tarefa 1");
        listaTarefas.adicionarTarefas("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.removerTarefas("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.obterDescricoesTarefas();



    }
}
