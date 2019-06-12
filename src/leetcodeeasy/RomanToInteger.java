package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String s1 = new StringBuilder(s).reverse().toString();
        int result = map.get(s1.charAt(0));

        for(int i=1; i<s1.length(); i++) {
            if (map.get(s1.charAt(i)) < map.get(s1.charAt(i-1))) {
                result = result - map.get(s1.charAt(i));
            } else {
                result = result + map.get(s1.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("MMXIV");
    }
}
