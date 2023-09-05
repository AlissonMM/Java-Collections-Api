package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //A chave é o codigo, e recebe um produto tambem
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        //passar o codigo e o produto
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            //.values retorna uma colecao com os valores
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        //Double.MIN_VALUE coloca o menor valor possivel
        double maiorPreco = Double.MIN_VALUE;
        
        for (Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() > maiorPreco){
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() < menorPreco){
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorValorEstoque = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() * p.getQuantidade() > maiorValor){
                maiorValor = p.getPreco() * p.getQuantidade();
                produtoMaiorValorEstoque = p;
            }
        }
        return produtoMaiorValorEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 10, 5);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 5, 11);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 2, 15);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 100, 1);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto que mais vale do estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
