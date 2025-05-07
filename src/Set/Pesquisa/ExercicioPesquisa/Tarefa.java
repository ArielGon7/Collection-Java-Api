package Set.Pesquisa.ExercicioPesquisa;

public class Tarefa {
    private String tarefas;

    public Tarefa(String tarefas) {
        this.tarefas = tarefas;
    }

    public String getTarefas() {
        return tarefas;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "tarefas='" + tarefas + '\'' +
                '}';
    }
}
