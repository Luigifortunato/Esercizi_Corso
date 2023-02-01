import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCercaParole {
    public static void main(String[] args) {

        char[][] tabella = {
                {'a', 'f', 'l', 'c', 'u'},
                {'t', 'r', 'u', 'a', 'i'},
                {'r', 's', 'i', 's', 'n'},
                {'i', 'h', 'g', 'a', 'm'},
                {'o', 'r', 's', 'o', 'w'}
        };
        for (int i =0; i< tabella.length;i++){
            System.out.println();
            for (int j=0; j<tabella[i].length;j++)
                System.out.print(tabella[i][j]+" ");
        }

        String[] parole = {"ciao","aria","luigi","orso","atrio","casa"};
        String s1="aflcu";

        char[] parola = s1.toCharArray();

        System.out.println(parola[3]);

        String prova = "";


        for(int i =0; i< tabella.length;i++){
            for(int j=0; j<tabella[i].length;j++){
                for (int k=0;k< parola.length;k++){
                    if (tabella[i][j]==parola[k]){
                        prova=prova+parola[k];
                        if (prova==s1) {
                        }



                }
            }
                System.out.println(prova);
            }
        }
        if (prova==s1) {
            System.out.println("Parola trovata");
        }else {
            System.out.println("Parola non trovata");
        }




    }
}
