package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        //HashSet nao fica organizado
        // entao tem que ser por TreeSet

        //Ele ja organiza usando o comparable
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        //dentro do TreeSet se passa o comparator, que diz como ele precisa ser organizado
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        //Passa toda a lista
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto D", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto A", 20d, 5);
        cadastroProdutos.adicionarProduto(3L, "Produto B", 10d, 5);
        cadastroProdutos.adicionarProduto(4L, "Produto C", 17d, 5);
        cadastroProdutos.adicionarProduto(4L, "Produto 5", 2d, 5);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
