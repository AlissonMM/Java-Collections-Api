package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //sem lista, pois descricoes sao unicas
        Tarefa tarefaRemover = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaRemover);

    }

    public Set<Tarefa> exibirTarefas(){
        return tarefaSet;
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : tarefaSet){
            //nao esta concluida
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                tarefaPendente = t;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");
        listaTarefas.adicionarTarefa("Tarefa3");
        listaTarefas.adicionarTarefa("Tarefa3");

        System.out.println(listaTarefas.exibirTarefas());

        System.out.println(listaTarefas.marcarTarefaConcluida("Tarefa1"));
        System.out.println(listaTarefas.marcarTarefaConcluida("Tarefa2"));
        System.out.println(listaTarefas.marcarTarefaPendente("Tarefa2"));

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        System.out.println("Lista deletada com sucesso" + listaTarefas.exibirTarefas());
    }



}
