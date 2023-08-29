package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefalist;

    //Cria a lista de tarefas
    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    //cria uma tarefa, com descricao e add na lista
    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));

    }


    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //para cada tarefa, chamei de t, na tarefalist ele compara pra ver se tem o parametro
        for(Tarefa t : tarefalist){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
            //remove todas as tarefas pra remover
            tarefalist.removeAll(tarefasParaRemover);
        }
    }

    public int obterNumeroTotalTarefas(){
        //retorna a quantidade de elemento em tarefalist
        return tarefalist.size();
    }

    //imprime todas as tarefas, as descriccoes
    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas e: " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas e: " + listatarefa.obterNumeroTotalTarefas());

        listatarefa.obterDescricoesTarefas();


    }


}
