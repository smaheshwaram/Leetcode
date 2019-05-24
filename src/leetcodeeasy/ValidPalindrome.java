package leetcodeeasy;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome =  new ValidPalindrome();
        validPalindrome.isValid( "OP" );

    }

    private boolean isValid(String s) {
        String s1 = "";
        for ( int i = 0; i < s.length(); i++ ) {
            if ( ((int) s.charAt( i ) >= 65 && (int) s.charAt( i ) <= 90) || ((int) s.charAt( i ) >= 97
                && (int) s.charAt( i ) <= 122) ) {
                s1 += s.charAt( i );
            }
        }

        StringBuilder sb = new StringBuilder( s1 );
        return s1.equalsIgnoreCase( sb.reverse().toString() );
    }
}
