import java.util.Scanner;

public class contaLettere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        frase.toLowerCase();
        int vocali =0;
        int consonanti=0;
        for (int i = 0; i<frase.length(); i++){
            if (frase.charAt(i)==' ') i++;
            if (frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||
                    frase.charAt(i)=='u'){
                vocali++;
            } else {
                consonanti++;
            }

            }
        System.out.println("Vocali: "+ vocali);
        System.out.println("Consonanti: "+consonanti);
        }
    }
