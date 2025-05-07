package Set.Pesquisa.AulaPesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContatos("julio", 1234567);
        agendaContatos.adicionarContatos("pedr", 555111);
        agendaContatos.adicionarContatos("Caio 0oxe", 847943);
        agendaContatos.adicionarContatos("Caio Oliva" , 97654);
        agendaContatos.adicionarContatos("arthur Meira", 848635);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Caio"));

        agendaContatos.atualizarNumeroContato("pedr", 2222222);
        agendaContatos.exibirContato();
    }
}
