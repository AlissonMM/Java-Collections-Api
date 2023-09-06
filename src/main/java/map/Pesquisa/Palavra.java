package main.java.map.Pesquisa;

public class Palavra {
    private String palavra;
    private Integer contagem;

    public String getPalavra() {
        return palavra;
    }

    public Integer getContagem() {
        return contagem;
    }

    public Palavra(String palavra, Integer contagem) {
        this.palavra = palavra;
        this.contagem = contagem;
    }



    @Override
    public String toString() {
        return "Palavra{" +
                "palavra='" + palavra + '\'' +
                ", contagem='" + contagem + '\'' +
                '}';
    }
}
