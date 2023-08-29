package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    //metodo para retornar quantos livros uma autor tem
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        //se a lista nao estiver vazia, esse comando retorna um booleano

        if(!livroList.isEmpty()){

            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int AnoInicial, int AnoFinal){

        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAnoPublicacao() >= AnoInicial && l.getAnoPublicacao() <= AnoFinal ){
                    livrosPorIntervalo.add(l);
                }
            }
        }


        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        //So uma variavel livro pois nao e uma lista, so um livro, o primeiro
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){

            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;

                    //Como é só pra pegar o primeiro da o break pra parar
                    break;
                }
            }

        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 3", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));


    }

}
