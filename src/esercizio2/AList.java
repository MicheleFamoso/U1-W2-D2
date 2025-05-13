package esercizio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class AList {

    protected ArrayList<Integer> numeri;


    public AList() {
       numeri = new ArrayList<>();
    }


    public void casual(int l){
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            int nr = random.nextInt(101);
            numeri.add(nr);
        }

    }


    public ArrayList<Integer> inverti(ArrayList<Integer> l){
        numeri = new ArrayList<Integer>(l);

        ArrayList<Integer> normale = new ArrayList<>(l);
        Collections.reverse(normale);
        numeri.addAll(normale);
        return numeri;


    }
    public void stampaPariDispari(ArrayList<Integer> lista, boolean pd){
        for (int i = 0; i < lista.size(); i++) {
            if (pd && i%2==0){
                System.out.println(lista.get(i));
            }else if (!pd && i % 2 != 0){
                System.out.println(lista.get(i));
            }
        }
    }


    @Override
    public String toString() {
        return "AList{" +
                "numeri=" + numeri +
                '}';

    }


}
