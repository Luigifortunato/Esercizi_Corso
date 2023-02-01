import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class RimpiazzaIntrusi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci stringa:");
        String a = sc.nextLine();
        System.out.print("Inserisci stringa:");
        String b = sc.nextLine();
        System.out.print("Inserisci stringa:");
        String c = sc.nextLine();
        replaceIntruder(a, b, c);
    } // main

    private static void replaceIntruder(String a, String b, String c) {
        String[] arrayStringhe = c.split(" ");
        System.out.println(arrayStringhe[0] + " " + arrayStringhe[1].replaceAll(a, b) + " " + arrayStringhe[2]);
    } // replaceIntruder
} // RimpiazzaIntrusi