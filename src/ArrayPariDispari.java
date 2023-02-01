import java.util.Arrays;

public class ArrayPariDispari {
    public static void main(String[] args) {
        int[] valori = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i<valori.length; i++){
            if (valori[i]%2!=0){
                valori[i]=valori[i]*2;
            }
        }
        System.out.println(Arrays.toString(valori));
    }
}
