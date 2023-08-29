package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Numero> numeroList;

    public SomaNumeros() {
        numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma(){
        int somaNumeros = 0;

        if (!numeroList.isEmpty()){
            for (Numero i : numeroList){
                somaNumeros += i.getNum();
            }
        }

        return somaNumeros;
    }

    public int encontrarMaiorNumero(){
        int maiorNum = 0;
        if (!numeroList.isEmpty()){
            for(Numero i : numeroList){
                if (i.getNum() > maiorNum){
                    maiorNum = i.getNum();
                }
            }
        }
        return maiorNum;
    }

    public int encontrarMenorNumero(){
        int menorNum = 1000000;
        if (!numeroList.isEmpty()){
            for(Numero i : numeroList){
                if (i.getNum() < menorNum){
                    menorNum = i.getNum();
                }
            }
        }
        return menorNum;
    }

    public List<Numero> exibirNumeros(){
        return numeroList;

    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
