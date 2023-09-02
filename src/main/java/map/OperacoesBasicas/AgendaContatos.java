package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Passo a chave e o value
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        //put serve para adicionar e atualizar
        // entao o adicionado por ultimo que entra
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            //passo a chave "nome", apartir da chave ele ja encontra
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer PesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            //get para pegar o value apartir da chave "nome"
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alisson", 123);
        agendaContatos.adicionarContato("Alisson", 1234);
        agendaContatos.adicionarContato("Wendel", 12345);
        agendaContatos.adicionarContato("Kayke", 123456);
        agendaContatos.adicionarContato("Yuji", 1234567);
        agendaContatos.adicionarContato("Yuji", 12345678);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Yuji");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.PesquisarPorNome("Kayke"));

    }
}
