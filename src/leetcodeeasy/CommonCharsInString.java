package leetcodeeasy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//return common characters of a string
public class CommonCharsInString {

    public static void main(String[] args) {
        CommonCharsInString commonCharsInString = new CommonCharsInString();
        commonCharsInString.findCommonChars("positive", "sensitive");
    }

    private Set<Character> findCommonChars(String str1, String str2) {
        Set<Character> set = new LinkedHashSet<>(  );
        for(int i=0; i<str1.length(); i++) {
            for (int j=0; j<str2.length(); j++) {
                if (str1.charAt( i ) == str2.charAt( j )) {
                    set.add(str1.charAt( i ));
                }
            }
        }

        //print common characters
        System.out.println( "common charcaters are: " );
        for (Character c : set) {
            System.out.println( c );
        }
        return set;
    }
}
