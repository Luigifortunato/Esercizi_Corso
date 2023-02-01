import java.util.Scanner;

public class OperazioniAritmetiche {

    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.print("Inserisci a:");
        int a=sc.nextInt();
        System.out.print("Inserisci b:");
        int b=sc.nextInt();
        computeValues(a, b);


    } // main

    private static void computeValues(int a, int b) {
        int somma = a+b;
        int sottrazione = a-b;
        int moltiplicazione = a*b;
        float divisione = (float)a/ (float)b;

        System.out.println("La somma dei due numeri è: "+ somma);
        System.out.println("La sottrazione tra A e B è: " + sottrazione);
        System.out.println("Il prodotto dei due numeri è: " + moltiplicazione);
        System.out.println("La divisione tra i due numeri è: "+ divisione);



    } // computeValues
} // OperazioniAritmetiche
 