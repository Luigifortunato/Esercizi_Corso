import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class ArrayTombola {
    public static void main(String[] args) {
        Random gen = new Random();
        int[][] cartella = new int[3][5];
        cartella[0][0] = 9;
        cartella[0][1] = 5;
        cartella[0][2] = 27;
        cartella[0][3] = 55;
        cartella[0][4] = 81;

        cartella[1][0] = 34;
        cartella[1][1] = 11;
        cartella[1][2] = 3;
        cartella[1][3] = 21;
        cartella[1][4] = 35;

        cartella[2][0] = 1;
        cartella[2][1] = 13;
        cartella[2][2] = 29;
        cartella[2][3] = 71;
        cartella[2][4] = 90;

        int[] numeri = new int[20];
        numeri = new int[]{9, 5, 27, 55, 81, 34, 11, 3, 21, 35, 1, 13, 29, 71, 90};

        int[] numeriRand = new int[20];
        int[][] cartellaRand = new int[3][5];

        int ambo = 0;
        int terno = 0;
        int quaterna = 0;
        int quintina = 0;

        int min = 1;
        int max = 90;

        //Genera Array Random
        for (int i = 0; i < numeriRand.length; i++) {
            numeriRand[i] = min + gen.nextInt(max - min + 1);
        } //for // Genera Array Random

        //Stampa Array Random
        System.out.println("ARRAY DI NUMERI RANDOM");
        System.out.println(Arrays.toString(numeriRand));

        // max - min +1


        // Genera cartella Random
        for (int i = 0; i < cartellaRand.length; i++) {
            for (int j = 0; j < cartellaRand[i].length; j++) {
                cartellaRand[i][j] = min + gen.nextInt(max - min + 1);
            } // for
        } // for // Genera cartella Random

        //Stampa della cartella RANDOM
        System.out.println();
        System.out.println("CARTELLA RANDOM");
        for (int i = 0; i < cartellaRand.length; i++) {
            System.out.println();
            for (int j = 0; j < cartellaRand[i].length; j++) {
                System.out.print(cartellaRand[i][j] + " ");
            } //for
        } //for
        //Stampa della cartella RANDOM



        /*//Stampa della cartella
        for (int i = 0; i < cartella.length; i++) {
            System.out.println();
            for (int j = 0; j < cartella[i].length; j++) {
                System.out.print(cartella[i][j] + " ");
            } //for
        } //for
        //Stampa della cartella*/


        //Controllo numeri
        for (int i = 0; i < cartellaRand.length; i++) {
            int somma1 = 0;
            for (int j = 0; j < cartellaRand[i].length; j++) {
                for (int k = 0; k < numeriRand.length; k++) {
                    if (cartellaRand[i][j] == numeriRand[k]) {
                        somma1 += 1;
                    } //for
                } //for
            } //for
            switch (somma1) {
                case 2:
                    ambo += 1;
                    break;
                case 3:
                    terno += 1;
                    break;
                case 4:
                    quaterna += 1;
                    break;
                case 5:
                    quintina += 1;
                    break;
            } //Switch

            /*if (quintina == 3) {
                System.out.println();
                System.out.println("TOMBOLAAAA!!!!");
                quintina = 0;
            } //if*/
        } //for
        // Controllo numeri

        // Stampa risultato
        if (quintina == 3) {
            System.out.println();
            System.out.println("TOMBOLAAAA!!!!");
            quintina = 0;
        } else {
            System.out.println();
            System.out.println("Hai totalizzato " + ambo + " ambo, " + terno + " terni, " + quaterna + " quaterne, " + quintina + " quintine!!");
        } //Stampa risultato
    } //main
} //ArrayTombola