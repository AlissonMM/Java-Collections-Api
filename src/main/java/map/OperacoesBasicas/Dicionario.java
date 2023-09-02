package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraProcurada = null;
        if (!palavrasMap.isEmpty()){
            palavraProcurada = palavrasMap.get(palavra);
        }
        return palavraProcurada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Lapis", "escreve1");
        dicionario.adicionarPalavra("Caneta", "escreve2");
        dicionario.adicionarPalavra("Pena", "escreve3");
        dicionario.adicionarPalavra("Tinta", "escreve4");
        dicionario.adicionarPalavra("Lapiseira", "escreve1");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Tinta");
        dicionario.exibirPalavras();

        System.out.println("Lapis encontrado: " + dicionario.pesquisarPorPalavra("Lapis"));
    }
}
