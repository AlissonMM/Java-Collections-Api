package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemlist;

    //cria a lista
    public CarrinhoDeCompras() {
        this.itemlist = new ArrayList<>();
    }

    //adiciona item, utilizando o metodo padrao Item
    public void adicionarItem(String nome, double preco, int quantidade){
        itemlist.add(new Item(nome, preco, quantidade));

    }

    //passa o nome, e se cada item tiver o nome ele add pra remover e depois remove todos com o nome
    public void RemoverItem(String nome){
        List<Item> itemRemover = new ArrayList<>();

        for (Item i: itemlist) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
            itemlist.removeAll(itemRemover);
        }


    }

    //calcula o valor total usando for each e os metodos get
    public double calcularValorTotal(){
        double valortotal = 0;
        for (Item i: itemlist) {
            valortotal += i.getPreco() * i.getQuantidade();

        }
        return valortotal;
    }

    //exibe tudo da lista, mas tive que criar o .ToString na classe Item
    public void exibirItens(){
        System.out.println(itemlist);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("abacate", 2, 10);
        carrinho.adicionarItem("laranja", 5, 5);
        System.out.println("preco total e: " + carrinho.calcularValorTotal());

        carrinho.RemoverItem("abacate");
        System.out.println("preco total e: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();
    }
}
