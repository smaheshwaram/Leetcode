package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

public class GoatLatin {
    public static void main(String[] args) {
        GoatLatin goatLatin = new GoatLatin();
        String s = "The quick brown fox jumped over the lazy dog";
        goatLatin.toGoatLatin(s);
    }

    public String toGoatLatin(String S) {
        List<String> list = new ArrayList<>();
        int count = 0;
        String str1[] = S.split(" ");
        if (str1.length == 0) {
            return "";
        }
        String s1 = "maa";
        for (String str : str1) {
            if (str.substring(0, 1).equalsIgnoreCase("a") || str.substring(0, 1).equalsIgnoreCase("e")
                    || str.substring(0, 1).equalsIgnoreCase("i") || str.substring(0, 1).equalsIgnoreCase("o")
                    || str.substring(0, 1).equalsIgnoreCase("u")) {
                if (count > 0) {
                    s1 += 'a';
                    list.add(" " + str + s1);
                } else {
                    list.add(str + "maa");
                }
                count++;
            } else {
                if (count > 0) {
                    s1 += 'a';
                    list.add(" " + str.substring(1, str.length()) + str.substring(0, 1) + s1);
                } else {
                    list.add(str.substring(1, str.length()) + str.substring(0, 1) + "maa");
                }
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String st : list) {
            sb.append(st);
        }

        return sb.toString();
    }



//    public String toGoatLatin(String S) {
//          private List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
//         String[] ss = S.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for(String s: S.split(" ")) {
//            if(sb.length() != 0)    sb.append(' ');
//            // consonant
//            if(!vowels.contains(s.toLowerCase().charAt(0))) {
//                s = s.substring(1) + s.charAt(0);
//            }
//            sb.append(s).append(ma).append(aStr);
//            aStr = aStr + 'a';
//        }
//        return sb.toString();
//    }

}
