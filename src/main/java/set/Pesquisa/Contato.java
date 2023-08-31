package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String  nome;

    private int cpf;

    public Contato(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    //Mudei o exemplo, aqui o contato só é único se o cpf for diferente
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getCpf() == contato.getCpf();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
