import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadratoNumeri {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci numero");
        int n = scan.nextInt();
        int quad = 1;
        List<Integer> somma = new ArrayList<>();
        somma.add(1);
        for(int i = 0; i<(n-1); i++) {
            quad = quad+2;
        somma.add(quad);
        }
        System.out.print(n*n +" = " + somma);





    }
}

