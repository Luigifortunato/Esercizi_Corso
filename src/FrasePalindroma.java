public class FrasePalindroma {
    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(isPalindrome("absca"));
        System.out.println(isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        String parola = "";
        for (int i=s.length()-1; i>=0; i--){
            parola +=s.charAt(i);
            //System.out.print(s.charAt(i));
        }
        //System.out.println(parola);
        if (parola.equalsIgnoreCase(s)) {
            return true;
        }
        return false;
    }
}
