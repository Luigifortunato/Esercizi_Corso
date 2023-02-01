import java.util.*;

import static java.lang.Integer.parseInt;

public class ArrayMinimoMassimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        Integer[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static Integer[] parseNumbers(String s) {
        String [] caratteri = s.split(",");

        Integer [] arrayInt = new Integer[caratteri.length];

        for (int i =0; i<caratteri.length; i++){
            arrayInt[i]=parseInt(caratteri[i]);
        }
        return arrayInt;
    }


    static void computeMinAndMax(Integer[] values) {
        Arrays.sort(values);
        System.out.println("Ordine crescente: "+Arrays.toString(values)+", il minimo è "+values[0]);

        Arrays.sort(values, Comparator.reverseOrder());
        System.out.println("Ordine decrescente: "+Arrays.toString(values)+", il massimo è "+values[0]);






    }
}
