public class ComparaStringhe {
    public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come vaa ?";
        compareStrings(a, b, c);
        a = "ciao come va ?";
        b = "cIao come vA a?";
        c = "ciao come vaa ?";
        compareStrings(a, b, c);
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        compareStrings(a, b, c);
    }

    private static int compareStrings(String a, String b, String c) {

        if (a.equalsIgnoreCase(b)&&(b.equalsIgnoreCase(c))){
            System.out.println("3");
        } //if
        else if (a.equalsIgnoreCase(b)&&(!a.equalsIgnoreCase(c))) {
            System.out.println("2");
        } //if
        else System.out.println("1");

        return 0;
    } //compareStrings
} // main

