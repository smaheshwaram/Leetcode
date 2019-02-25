package leetcodeeasy;

//Input: A = "this apple is sweet", B = "this apple is sour"
//        Output: ["sweet","sour"]

import java.lang.reflect.Array;
import java.util.*;

public class UnCommonWords {
    public static void main(String[] args) {
        UnCommonWords unCommonWords = new UnCommonWords();
        String str1 = "this apple is sweet";
        String str2 = "this apple is sour";

        unCommonWords.uncommonFromSentences(str1, str2);
    }

    public String[] uncommonFromSentences(String A, String B) {

        String str1[] = A.split(" ");
        String str2[] = B.split(" ");

        List<String> list = new ArrayList<>();

        for(String s: str1) {
            list.add(s) ;
        }
        for(String s: str2) {
            list.add(s);
        }


        String[] str3 = list.toArray(new String[0]);

        Map<String, Integer> map = putWordsInMap(str3, new HashMap<>());

        list = new ArrayList<>();

        for(int i=0; i<str3.length; i++) {
            if (map.get(str3[i]) == 1) {
                list.add(str3[i]);
            }
        }

        return list.toArray(new String[0]);

    }

    public HashMap<String, Integer> putWordsInMap(String[] str1, HashMap<String, Integer> map) {
        for(String s: str1) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

}
