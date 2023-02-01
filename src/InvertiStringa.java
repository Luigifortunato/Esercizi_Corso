import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci stringa:");
        String a = sc.nextLine();
        reverseString(a);
    } //main

    private static void reverseString(String s) {
        String[] split = s.split(" ");
        System.out.println(split[1] + " " + split[0]);
    } // reverseString
} // InvertiStringa