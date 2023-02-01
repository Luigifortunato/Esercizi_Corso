import java.util.Scanner;

public class ContaOccorrenze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        countOccurrences(a.charAt(0), b);
    }

    static void countOccurrences(char a, String b) {
        int n=0;
        for (int i =0; i<b.length(); i++){
            if (a==b.charAt(i)) n+=1;
        }
        System.out.println("Numero occorrenze " + n);




    }
}
 