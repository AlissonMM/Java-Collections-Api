package main.java.list.pesquisa;

public class Numero {
    private int num;

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return
                "numero=" + num +
                '}';
    }
}
