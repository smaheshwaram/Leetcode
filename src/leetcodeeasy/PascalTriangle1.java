package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        if (numRows == 0) {
            return list1;
        }
        if (numRows >= 1) {
            list3.add(1);
        }
        list1.add(list3);

        for (int i=1; i<numRows; i++) {
            int count = 0;
            List<Integer> list2 = new ArrayList<>();

            for(int j=0; j<=i; j++) {
                if (j==0 || j == i) {
                    list2.add(1);
                }
                else {
                    list2.add(list1.get(i-1).get(count) + list1.get(i-1).get(++count));
                }
            }

            list1.add(list2);

        }
        return list1;
    }
}
