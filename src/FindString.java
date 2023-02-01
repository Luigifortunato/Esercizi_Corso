import java.util.Arrays;
import java.util.Scanner;

public class FindString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] matrice = {

                {'c', 'a', 'n', 'e', 'c'},
                {'a', 'u', 'a', 'a', 'u'},
                {'s', 'u', 'n', 'g', 'i'},
                {'c', 'e', 'i', 'e', 'g'},
                {'o', 'v', 'o', 'u', 'o'},
        };
        //Inizializzo le variabili per i cicli
        int conta = 0;
        String parola = "";

        //Stampo la matrice
        for (int i = 0; i < matrice.length; i++) {
            System.out.println();
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + "  ");
            } //for
        } //for

        //Prendo in input la parola
        System.out.println();
        System.out.println("Che parola vuoi cercare?");
        String s1 = scan.nextLine();

        //Trasformo la parola in ARRAY
        char[] array = s1.toCharArray();


        // Cerco la parola nella matrice in modo ORIZZONTALE
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j <= matrice[0].length - array.length; j++) {
                for (int k = j; k < array.length + j; k++) {
                    parola += matrice[i][k];
                }//for
                if (parola.equals(s1)) {
                    conta += 1;
                }//if
                parola = ""; // rendo vuota la stringa per il loop
            }//for
        }//for

        //Stampo il risultato
        if (conta != 0) {
            System.out.println("la parola si trova " + conta + " volte in orizzontale");
        } //if


        //Azzero la variabile per il ciclo
        conta = 0;


        // Cerco la parola nella matrice in modo VERTICALE
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j <= matrice[0].length - array.length; j++) {
                for (int k = j; k < array.length + j; k++) {
                    parola += matrice[k][i];
                } // for
                if (parola.equals(s1)) {
                    conta += 1;
                } // if
                parola = ""; // rendo vuota la stringa per il loop
            } // for
        } // for

        // Stampo il risultato
        if (conta != 0) {
            System.out.println("la parola si trova " + conta + " volte in verticale");
        } // if

        //Azzero la variabile per il ciclo
        conta = 0;


        //Inverto la la parola
        for (int i = 0; i < array.length; i++) {
            array[array.length - i - 1] = s1.charAt(i);
        } // for
        // Inserisco l'array al contrario in una stringa
        String parolaRev = String.copyValueOf(array);



        // Cerco la parola al CONTRARIO nella matrice
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j <= matrice[0].length - array.length; j++) {
                for (int k = j; k < array.length + j; k++) {
                    parola += matrice[i][k];
                } // for
                if (parola.equals(parolaRev)) {
                    conta += 1;
                } //if
                parola = ""; // rendo vuota la stringa per il loop
            } //if
        } // for

        // Stampo il risultato
        if (conta != 0) {
            System.out.println("la parola si trova " + conta + " volte al contrario");
        } // if


        //Azzero la variabile per il ciclo
        conta = 0;


        //Cerco la parola in DIAGONALE (da sinistra a destra)
        for (int k = 0; k < array.length; k++) {
            parola += matrice[k][k];
        } // for
        if (parola.equals(s1)) {
            conta += 1;
        } // if
        parola = ""; // rendo vuota la stringa per il loop

        // Stampo il risultato
        if (conta != 0) {
            System.out.println("la parola si trova " + conta + " volte in diagonale");
        } // if


        //Azzero la variabile per il ciclo
        conta = 0;


        //Cerco la parola in DIAGONALE (da destra a sinistra)
        for (int j = 0; j < matrice[0].length; j++) {
            for (int k = array.length - 1; k >= 0; k--) {
                parola += matrice[j][k];
            } // for
            if (parola.equals(parolaRev)) {
                conta += 1;
            } // if
            parola = ""; // rendo vuota la stringa per il loop
        } // for

        // Stampo il risultato
        if (conta != 0) {
            System.out.println("la parola si trova " + conta + " volte in diagonale, da destra a sinistra");
        } // if
    } // main
} // FindString