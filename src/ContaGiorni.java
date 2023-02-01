import java.util.Scanner;

public class ContaGiorni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero di secondi da convertire");
        int sec = scan.nextInt();
        double min = sec/60;
        double minArr = Math.round(min*100.)/100;
        double ore = min / 60;
        double oreArr = Math.round(ore*100.)/100;
        double giorni = ore/24;
        double gioArr = Math.round(giorni*10000.)/10000;

        System.out.println("Giorni: "+gioArr +","+ "Ore: "+oreArr+","+ "Minuti: "+minArr);
    }
}
