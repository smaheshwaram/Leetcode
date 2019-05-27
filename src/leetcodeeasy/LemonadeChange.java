package leetcodeeasy;
/*
At a lemonade stand, each lemonade costs $5.

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.

Note that you don't have any change in hand at first.

Return true if and only if you can provide every customer with correct change.



Example 1:

Input: [5,5,5,10,20]
Output: true
Explanation:
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.
 */

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {

    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] bills = {5, 5, 5, 10, 20};
        lemonadeChange.lemonadeChange(bills);
    }


    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<bills.length; i++) {
            if (!map.containsKey(bills[i])) {
                map.put(bills[i], 1);
                if (!check(bills[i], map)) {
                    return false;
                }
            } else {
                map.put(bills[i], map.get(bills[i]) + 1);
                if (!check(bills[i], map)) {
                    return false;
                }
            }

        }
        return true;

    }

    private boolean check(int val, Map<Integer, Integer> map) {
        if (val == 10) {
            if (!map.containsKey(5) || map.get(5) < 1) {
                return false;
            } else {
                map.put(5, map.get(5) - 1);
            }
        }
        if (val == 20) {
            if (!map.containsKey(5) || map.get(5) < 1) {
                return false;
            } else {
                if (map.containsKey(10) && map.get(10) > 0) {
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                } else {
                    if (map.get(5) < 3) {
                        return false;
                    } else {
                        map.put(5, map.get(5) - 3);
                    }
                }
            }
        }
        return true;
    }
}
