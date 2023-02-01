import java.util.Arrays;
import java.util.Scanner;

public class ArrayTabelline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Scegliere la dimensione dell'array");
        int m = scan.nextInt();
        System.out.println("Inserisci valore");
        int n = scan.nextInt();

        int[] tabelline =new int[m];

        for (int i=0; i< tabelline.length; i++){
            tabelline[i] = i*n;
        }
        System.out.println(Arrays.toString(tabelline));

    }
}
