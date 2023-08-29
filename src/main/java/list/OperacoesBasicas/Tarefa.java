package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    //Para nao mostrar o endereco de memoria e sim a descricao
    @Override
    public String toString() {
        return  descricao;
    }
}
