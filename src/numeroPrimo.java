public class numeroPrimo {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 1;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 2;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 3;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 631;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 17;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 999;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
        number = 33;
        System.out.println("Il numero "+ number +" è primo? "+ isPrime(number));
    }

    private static boolean isPrime(int number) {

        if (number == 1) return false;
        if (number ==2|| number ==3) {
            return true;
        }
        for (int i =2; i<10; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
