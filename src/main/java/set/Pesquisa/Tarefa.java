package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    private String descricao;
    private boolean concluida;

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
