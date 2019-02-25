package leetcodeeasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndReverseList {

    public static void main(String[] args) {
        SortAndReverseList sortAndReverseList = new SortAndReverseList();
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(4);
        list.add(3);
        list.add(10);

        Collections.sort(list);
        Collections.reverse(list);

        for(Integer i: list) {
            System.out.println(i);
        }

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Hello Pete");
        list2.add("Pete oHell");


        System.out.println(sortAndReverseList.checkAnagram(list1, list2));

    }

    private boolean checkAnagram(List<String> list1, List<String> list2) {

        if(list1.isEmpty() || list2.isEmpty() || list1.size() != list2.size()) {
            return false;
        }

        String str = "uiyop";
        System.out.println("***" + str.indexOf("iyo"));

        char[] c1 = list1.get(0).toCharArray();
        char[] c2 = list2.get(0).toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);


        return Arrays.equals(c1, c2);
    }
}
