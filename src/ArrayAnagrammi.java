import java.util.Arrays;
import java.util.Scanner;

public class ArrayAnagrammi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        System.out.println(arrayA);
        System.out.println(arrayB);

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i]) {
                System.out.println("Non anagrammi");
                break;
            } else System.out.println("Anagrammi");
            break;
        }
    }
}