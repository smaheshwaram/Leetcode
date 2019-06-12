package leetcodeeasy;

public class ChartoEmpty {

    public static void main(String[] args) {
        ChartoEmpty chartoEmpty = new ChartoEmpty();
        System.out.println("Result: " + chartoEmpty.setCharToEmpty("helloyou"));
    }

    private String setCharToEmpty(String s) {
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder( s );
        for(int i=0; i<s.length(); i++) {
            if (i == 4) {
                sb.deleteCharAt( i );
//                sb.setCharAt( i, '\0' );
            }
        }
        return sb.toString();
    }
}
