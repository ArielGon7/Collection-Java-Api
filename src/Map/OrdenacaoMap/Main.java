package Map.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao1 ");
        eventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        eventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao3");
        eventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 7), "Evento 4", "Atracao 4");

        eventos.exibirAgenda();
        eventos.obterProximoEvento();

    }
}
