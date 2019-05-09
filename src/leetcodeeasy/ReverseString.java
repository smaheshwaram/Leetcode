package leetcodeeasy;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str = "hello";
        System.out.println("Reversed string is: " + reverseString.reverse(str));

        //Check if substring exits
        System.out.println("PIS substring exists: ");
        System.out.println(reverseString.isSubString(str));

        //Print first non repetitive of given string
        System.out.println("Printing first non repetitive word: ");
    }

    private String reverse(String str) {
        String s = "";

        for(int i=str.length()-1; i>=0; i--) {
            s = s + str.charAt(i);
        }

        return s;
    }

    private boolean isSubString(String str) {
        return str.contains("ell");
    }
}
