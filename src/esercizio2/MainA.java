package esercizio2;

import java.util.ArrayList;

public class MainA {
    public static void main(String[] args) {
        AList l1 = new AList();
        l1.casual(5);
        System.out.println(l1);
        AList l2 = new AList();
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(6);
        l3.add(9);
        l2.inverti(l3);
        System.out.println(l2);
        l2.stampaPariDispari(l3,false);
    }


}
