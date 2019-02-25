package interview;

public class ReplaceChar {

    public static void main(String[] args) {
        ReplaceChar replaceChar = new ReplaceChar();
        String s1 = replaceChar.replaceGivenChar("what's up", 'u', 'i') ;
        System.out.println("Replaced string : " + s1);
    }

    private String replaceGivenChar(String s, char oldChar, char newChar) {
        String s1 = s.replace(oldChar, newChar);
//        Replace char at index 4
//        StringBuilder sb = new StringBuilder(s);
//        sb.setCharAt(4, '+');
//        System.out.println("Using string builder replaced string is: " + sb.toString());

//        Replace char at index 4 using sub string
        String s2 = s.substring(0,4) + '+' + s.substring(5);
        System.out.println("Using substring : " + s2);

        return s1;
    }
}
