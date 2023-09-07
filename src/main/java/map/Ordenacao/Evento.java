package main.java.map.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private List<String> atracao = new ArrayList<>();

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao.add(atracao);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atrações='" + atracao + '\'' +
                '}';
    }
}
