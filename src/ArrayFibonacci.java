import java.util.Arrays;
import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter index:");
            int index =scan.nextInt();
            fibonacci(index);
    }

    static void fibonacci(int index) {
        int n = 0;
        int m = 1;
        System.out.print(n+" "+m);
        for (int i =2; i<=index; ++i){
            int fib = n+m;
            System.out.print(" "+fib);
            n=m;
            m=fib;
        }
    }
}

