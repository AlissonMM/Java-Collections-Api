package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    Map<Long, Palavra>palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(Long codigo, String palavra, Integer contagem){
        palavrasMap.put(codigo, new Palavra(palavra, contagem));
    }

    public void removerPalavraPorCod(Long cod){
        palavrasMap.remove(cod);
    }

    public Map<Long, Palavra> exibirContagemPalavras(){
        return palavrasMap;
    }

    public Palavra encontrarPalavraMaisFrequente(){
        Palavra palavraMaisFrequente = null;
         Integer maisVezes = Integer.MIN_VALUE;
        for (Palavra p : palavrasMap.values()){
            if (p.getContagem() > maisVezes){
                maisVezes = p.getContagem();
                palavraMaisFrequente = p;
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        System.out.println(contagemPalavras.exibirContagemPalavras());

        contagemPalavras.adicionarPalavra(1L, "Palavra1", 2);
        contagemPalavras.adicionarPalavra(2L, "Palavra2", 10);
        contagemPalavras.adicionarPalavra(3L, "Palavra3", 30);
        contagemPalavras.adicionarPalavra(4L, "Palavra4", 1);

        System.out.println(contagemPalavras.exibirContagemPalavras());

        contagemPalavras.removerPalavraPorCod(4L);

        System.out.println(contagemPalavras.exibirContagemPalavras());

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());





    }
}
