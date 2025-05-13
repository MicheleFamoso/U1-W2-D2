package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SequencedCollection;

public class E1 {
    public static void main(String[] args) {
        HashSet<String> parole = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int numero = scanner.nextInt();
        String parola;
        HashSet<String> duplicati = new HashSet<>();

        for (int i = 0; i < numero; i++) {
            System.out.println("inserisci parola");
            parola = scanner.next();
            if (!parole.add(parola)){
                duplicati.add(parola);
            }else {
                parole.add(parola);
            }
           ;
        }


        System.out.println("Parole duplicate : " + duplicati);
        System.out.println("Numero parole distinte : " + parole.size());

        for (String s:parole){
            System.out.println("Parole distinte : " + s);
        }

    }
}
