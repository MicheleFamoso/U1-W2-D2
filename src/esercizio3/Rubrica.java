package esercizio3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    protected HashMap<Integer,String> contatto;

    public Rubrica() {
        contatto = new HashMap<>();
    }

    public void inserisciContatto(Integer numero, String nome){
        contatto.put(numero,nome);
    }

    public void eliminaContatto(Integer numero){
        contatto.remove(numero);
    }

    public void stampa(){
    System.out.println(contatto);
    }

    public String cercaPerNome(String nome){
        for (Integer numero: contatto.keySet()){
            if (contatto.get(numero).equals(nome)){

                return  "Il numero di " + nome + " e'" + numero;
            }
        }return "contatto non trovato";
    }

}
