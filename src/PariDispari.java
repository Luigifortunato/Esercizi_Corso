import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Inserisci numero:");
        int numero =sc.nextInt();
        checkEvenOdd(numero);
    } // main

    private static void checkEvenOdd(int numero) {
        if ((numero%2)==0) {
            System.out.println("True: il numero è pari");
        } // if
        else System.out.println("false: il numero è dispari");
    } // checkEvenOdd
} // PariDispari
 