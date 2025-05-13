package esercizio3;

public class MainRubrica {
    public static void main(String[] args) {
        Rubrica n1 = new Rubrica();
        n1.inserisciContatto(2345,"michele");
        n1.inserisciContatto(456,"maria");
        n1.inserisciContatto(1234,"sofia");
        n1.stampa();
        System.out.println( n1.cercaPerNome("maria"));
        System.out.println(n1.cercaPerNome("sofia"));


    }
}
