package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarCrescente(){
        List<Numero> listCrescente = new ArrayList<>(numeroList);
        Collections.sort(listCrescente);
        return listCrescente;
    }

    public List<Numero> ordenarDecrecente(){
        List<Numero> listDecrecente = new ArrayList<>(numeroList);
        //Para ir ao contrario se usa Collections.reverseOrder
        listDecrecente.sort(Collections.reverseOrder());
        return listDecrecente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(18);
        ordenacaoNumeros.adicionarNumero(99);
        ordenacaoNumeros.adicionarNumero(37);

        System.out.println(ordenacaoNumeros.ordenarCrescente());
        System.out.println(ordenacaoNumeros.ordenarDecrecente());
    }
}
