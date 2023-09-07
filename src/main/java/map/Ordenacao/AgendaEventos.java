package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //LocalDate para local e data
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        //usar o treemap para organizar, e o LocalDate ja organiza,
        // entao nem precisa do comparable ou comparator
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*
        //keySet é um metodo de hashmap que retorna um Set com as keys
       Set<LocalDate> dataSet = eventosMap.keySet();
        //.values, como ja visto, retorna uma collection com os valores
        Collection<Evento> valuesCollection = eventosMap.values();
        */

        //LocalDate.now retorna a data atual

         LocalDate dataAtual = LocalDate.now();

         //organiza o map, para termos os eventos por ordem de data
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        LocalDate proximaData = null;
        Evento proximoEvento = null;

        //entrySet Retorna um Set de chaves e seus respectivos valores, objeto chamado entry
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet())
            /*for (var entry : eventosTreeMap.entrySet()) tambem poderia desse jeito*/
        {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento  + " acontecerá na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        //teste LocalDate.now
        System.out.println(LocalDate.now());

        AgendaEventos agendaEventos = new AgendaEventos();
        //LocalDate.of serve para passar o data de determindado lugar, ai passa os parametros
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 15), "Evento1", "atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento2", "atracao2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 01, 10), "Evento3", "atracao3");
        agendaEventos.adicionarEvento(LocalDate.now(), "Evento4", "atracao4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 1, 12), "Evento5", "atracao5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
