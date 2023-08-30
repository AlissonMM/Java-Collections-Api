package main.java.list.Ordenacao;

public class Numero implements Comparable<Numero>{
    private int num;

    @Override
    public int compareTo(Numero o) {
        return Integer.compare(num, o.getNum());
    }

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
