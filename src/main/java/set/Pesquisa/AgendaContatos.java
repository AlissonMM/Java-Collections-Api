package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int cpf){
        contatoSet.add(new Contato(nome, cpf));
    }

    public Set<Contato> exibirContatos(){
        return contatoSet;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato t : contatoSet) {
                if (t.getNome().startsWith(nome) || t.getNome().endsWith(nome)) {
                    contatosPorNome.add(t);
                }

            }
        }
        return contatosPorNome;

    }

    public Contato atualizarNomeContato(int cpf, String novoNome){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getCpf() == cpf){
                c.setNome(novoNome);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alisson", 1234);
        agendaContatos.adicionarContato("Wendel", 6666);
        agendaContatos.adicionarContato("Kayke", 7234);
        agendaContatos.adicionarContato("Yuji", 4567);
        agendaContatos.adicionarContato("Yuji", 9999);
        //Nao entra pois tem mesmo cpf
        agendaContatos.adicionarContato("Caio", 1234);

        System.out.println(agendaContatos.exibirContatos());

        System.out.println(agendaContatos.pesquisarPorNome("Yuji"));
        System.out.println(agendaContatos.pesquisarPorNome("Kayke"));

        System.out.println("Contato com nome atualizado:" +
                agendaContatos.atualizarNomeContato(1234, "Alisson Diferente"));
    }
}
