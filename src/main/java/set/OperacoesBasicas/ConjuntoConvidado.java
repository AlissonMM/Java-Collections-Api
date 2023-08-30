package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    //set so aceita elementos diferentes, nao repitidos, como o list
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidado(String nome, int codigoConvite){
        //o metodo add do set so aceita passar o objeto e nao a posicao,
        // como aceitava tambem o list
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        //nao precisa ser Set, pois o codigo do convite é único
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                //ja encontramos, entao para
                break;
            }
            //usamos remove para remover

        }
        convidadoSet.remove(convidadoParaRemover);

            }

            public int contarConvidados(){
                //size é usado para retornar o tamanho
                return convidadoSet.size();
            }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados());


        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();
    }
        }

