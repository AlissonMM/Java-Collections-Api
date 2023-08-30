package main.java.list.Ordenacao;

import java.util.Comparator;

//Implemente interface comparable para ser "comparavel"
public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;
    private double altura;

    //Compara usando o Integer, para inteiros, compare e passa a idade e a idade do objeto p, que sera o objeto
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }



    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

//Classe para comparar por altura
class ComparatorPorAltura implements Comparator<Pessoa>{


    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        //Compara usando o Double, para double, comparando duas alturas
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
