package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

public class AddLetter {
    public static void main(String[] args) {
        AddLetter addLetter =  new AddLetter();
        String[] str = {"amy", "swe", "lamda", "such" };
        addLetter.addLetterBasedOnCount(str);
    }

    private String addLetterBasedOnCount(String str[]) {
        int count =0;
        List<String> list = new ArrayList<>();
        int n = str.length;

        String s1 = "ma";
        s1.toLowerCase();
        for(String str1 : str) {
            if (count == 0) {
                list.add(str1 + s1);
                count++;
            } else {
                s1 += 'a';
                list.add(" " + str1 + s1);
            }

        }

        StringBuilder sb = new StringBuilder();
        for (String string : list) {
            sb.append(string);
        }
        return sb.toString();
    }
}
