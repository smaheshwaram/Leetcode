package leetcodeeasy;

import java.util.Arrays;

public class StoneWeight {

    public static void main(String[] args) {
        StoneWeight stoneWeight = new StoneWeight();
        int[] stones = {1,3};
        stoneWeight.lastStoneWeight(stones);
    }

    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int len = stones.length-1;

        if (len == 0) {
            return stones[len];
        }
        if (len == 1) {
            if (stones[0] == stones[1]) {
                return 0;
            }
            compare(stones, 0);
            return stones[0];
        }

        for(int i= len-1 ;i>=0; i--) {
            i = compare(stones, i);
            Arrays.sort(stones);

        }

        return stones[0];

    }

    private int compare(int[] stones, int i) {
        if (stones[i] < stones[i+1]) {
            stones[i] = stones[i+1] - stones[i];
            stones[i+1] = Integer.MAX_VALUE;
        } else if ( stones[i] > stones[i+1]) {
            stones[i] = stones[i] - stones[i+1];
            stones[i+1] = Integer.MAX_VALUE;
        }
        else {
            if (i == 0 && (stones[i] == stones[i+1])) {
                stones[i] = 0;
                stones[i+1] = 0;
            } else {
                stones[i] = Integer.MAX_VALUE;
                stones[i+1] = Integer.MAX_VALUE;
            }
            i = i-1;
        }
        return i;
    }
}
