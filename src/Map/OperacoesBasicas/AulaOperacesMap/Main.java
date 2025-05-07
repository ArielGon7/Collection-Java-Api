package Map.OperacoesBasicas.AulaOperacesMap;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("paulo", 12345);
        agendaContatos.adicionarContato("paulo", 222222);
        agendaContatos.adicionarContato("paulo Andrade", 86868686);
        agendaContatos.adicionarContato("paulo Melo", 00000);
        agendaContatos.adicionarContato("Jefferson Silva", 5555);
        agendaContatos.adicionarContato("Caio", 12345);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Jefferson Silva");

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("paulo Andrade"));
    }
}
