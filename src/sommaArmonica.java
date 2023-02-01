public class sommaArmonica {
    public static void main(String[] args) {
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));
    }

    private static double harmonicSum(int n) {
        double somma=0;
        for (double i = 1.; i<=n; i++){
            if (n==0) return 0;
            somma += (1./i);
        }
        return somma;
    }
}
